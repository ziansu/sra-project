@org.apache.isis.applib.annotation.Programmatic
@java.lang.Override
public <T> T execute(final T domainObject) {
    ensureDependenciesInjected();
    final java.lang.Class<? extends java.lang.Object> cls = domainObject.getClass();
    final javassist.util.proxy.MethodHandler methodHandler = newMethodHandler(domainObject);
    return newProxy(cls, methodHandler);
}