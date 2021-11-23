public static boolean checkAndAdd(final com.orientechnologies.orient.core.record.impl.ODocument document) {
    final java.util.Map<com.orientechnologies.orient.core.record.impl.ODocument, java.lang.Boolean> iMarshalledRecords = com.orientechnologies.orient.core.serialization.serializer.record.OSerializationSetThreadLocal.INSTANCE.get();
    if (iMarshalledRecords.containsKey(document))
        return false;
    
    iMarshalledRecords.put(document, java.lang.Boolean.FALSE);
    return true;
}