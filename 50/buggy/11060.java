public static java.util.Map<java.lang.String, byte[]> serializeVariableMap(java.util.Map<java.lang.String, java.io.Serializable> variableMap) {
    java.util.Map<java.lang.String, byte[]> serializedMap = org.ow2.proactive.scheduler.common.util.AllObjects2BytesConverterHandler.convertAllObjects2Bytes(variableMap);
    return serializedMap;
}