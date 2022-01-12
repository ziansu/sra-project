@java.lang.Override
public java.lang.Object get(java.lang.String name, org.springframework.beans.factory.ObjectFactory<?> objectFactory) {
    devbury.threadscope.ThreadScopeState state = getThreadScopeState();
    java.lang.Object object = state.getBean(name);
    if (object == null) {
        state.addBean(name, objectFactory);
        object = state.getBean(name);
    }
    return object;
}