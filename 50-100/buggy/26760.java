private boolean isBuildable(javax.lang.model.element.TypeElement typeElement) {
    if (typeElement != null) {
        for (javax.lang.model.element.Element el : typeElement.getEnclosedElements()) {
            if ((el.getAnnotation(io.sundr.builder.annotations.Buildable.class)) != null) {
                return true;
            }
        }
    }
    return io.sundr.builder.internal.BuilderContextManager.getContext().getRepository().isBuildable(typeElement);
}