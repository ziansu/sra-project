public <T> void changeType(spoon.reflect.declaration.CtTypedElement<T> typedElem) {
    spoon.reflect.reference.CtTypeReference<T> type = typedElem.getType();
    java.util.Optional<java.lang.Class<?>> substituteOpt = hr.github.anivanovic.codetransform.support.TypeMapping.getSubstituteClass(type.getActualClass());
    substituteOpt.ifPresent(( clazz) -> {
        final spoon.reflect.reference.CtTypeReference<T> newType = this.getFactory().Code().createCtTypeReference(clazz);
        typedElem.setType(newType);
    });
}