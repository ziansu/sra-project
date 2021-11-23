public <T> spoon.reflect.declaration.CtClass<T> create(spoon.reflect.declaration.CtPackage owner, java.lang.String simpleName) {
    spoon.reflect.declaration.CtClass<T> c = factory.Core().createClass();
    c.setSimpleName(simpleName);
    if (owner.getTypes().contains(c)) {
        owner.removeType(c);
    }
    owner.addType(c);
    c.setParent(owner);
    return c;
}