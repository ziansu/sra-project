private static java.lang.Object deserialize(byte[] bytes, java.lang.reflect.Type type) {
    java.lang.Object object = null;
    try {
        object = weborb.util.io.Serializer.fromBytes(bytes, ISerializer.AMF3, false);
        if (object instanceof weborb.types.IAdaptingType)
            return type == null ? ((weborb.types.IAdaptingType) (object)).defaultAdapt() : ((weborb.types.IAdaptingType) (object)).adapt(type);
        
    } catch (java.lang.Exception e) {
        throw new com.backendless.exceptions.BackendlessException(e);
    }
    return object;
}