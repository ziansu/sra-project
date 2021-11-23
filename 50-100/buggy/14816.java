private void redefineTargetClassAndCreateInstanceFactory(@mockit.internal.expectations.mocking.NotNull
java.lang.reflect.Type typeToMock) {
    java.lang.Integer mockedClassId = redefineClassesFromCache();
    if (mockedClassId == null) {
        return ;
    }
    boolean redefined = redefineMethodsAndConstructorsInTargetType();
    if (redefined) {
        instanceFactory = createInstanceFactory(typeToMock);
        storeRedefinedClassesInCache(mockedClassId);
    }
}