protected static com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema getCurrentSerializedSchema() {
    if (!(ODatabaseRecordThreadLocal.INSTANCE.isDefined()))
        return null;
    
    com.orientechnologies.orient.core.storage.OStorage storage = ODatabaseRecordThreadLocal.INSTANCE.get().getStorage();
    com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema serializedShchema = storage.getResource(com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.SIMPLE_NAME, new java.util.concurrent.Callable<com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema>() {
        @java.lang.Override
        public com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema call() throws java.lang.Exception {
            return new com.orientechnologies.orient.object.enhancement.OObjectEntitySerializer.OObjectEntitySerializedSchema();
        }
    });
    return serializedShchema;
}