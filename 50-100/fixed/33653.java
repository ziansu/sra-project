public static java.util.Map<java.lang.String, java.io.Serializable> deserializeVariableMap(java.util.Map<java.lang.String, byte[]> target, java.lang.ClassLoader cl) throws java.io.IOException, java.lang.ClassNotFoundException {
    if (target == null) {
        return new java.util.HashMap<>();
    }
    return org.ow2.proactive.scheduler.common.util.AllObjects2BytesConverterHandler.convertAllBytes2Objects(target, cl);
}