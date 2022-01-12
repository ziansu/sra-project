public <T> spoon.reflect.declaration.CtClass<T> create(spoon.reflect.declaration.CtPackage owner, java.lang.String simpleName) {
    spoon.reflect.declaration.CtClass<T> c = factory.Core().createClass();
    c.setSimpleName(simpleName);
    owner.addType(c);
    return c;
}