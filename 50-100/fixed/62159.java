@java.lang.SuppressWarnings(value = "unchecked")
public java.lang.Object createInstance(java.lang.reflect.Type type) {
    TestGenerator.ArgumentCache.GraphAdapterBuilder.Graph graph = graphThreadLocal.get();
    if ((graph == null) || ((graph.nextCreate) == null)) {
        throw new java.lang.IllegalStateException(("Unexpected call to createInstance() for " + type));
    }
    com.google.gson.InstanceCreator<?> creator = instanceCreators.get(type);
    java.lang.Object result = creator.createInstance(type);
    graph.nextCreate.value = result;
    graph.nextCreate = null;
    return result;
}