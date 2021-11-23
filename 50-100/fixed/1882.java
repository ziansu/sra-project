public T create() {
    if ((iCloneMethod) == null) {
        findCloneMethod();
    }
    try {
        return ((T) (iCloneMethod.invoke(iPrototype, ((java.lang.Object) (null)))));
    } catch (java.lang.IllegalAccessException ex) {
        throw new org.apache.commons.collections15.FunctorException("PrototypeCloneFactory: Clone method must be public", ex);
    } catch (java.lang.reflect.InvocationTargetException ex) {
        throw new org.apache.commons.collections15.FunctorException("PrototypeCloneFactory: Clone method threw an exception", ex);
    }
}