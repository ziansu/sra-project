public void initSchema(com.ibm.streams.operator.StreamSchema ss) throws java.lang.Exception {
    java.util.Set<com.ibm.streams.operator.Type.MetaType> supportedTypes = new java.util.HashSet<com.ibm.streams.operator.Type.MetaType>();
    supportedTypes.add(MetaType.MAP);
    messageHeaderAH.initialize(ss, false, supportedTypes);
    supportedTypes.remove(MetaType.MAP);
    supportedTypes.add(MetaType.RSTRING);
    supportedTypes.add(MetaType.USTRING);
    routingKeyAH.initialize(ss, false, supportedTypes);
    supportedTypes.add(MetaType.BLOB);
    messageAH.initialize(ss, true, supportedTypes);
}