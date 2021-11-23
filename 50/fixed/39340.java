public static com.orientechnologies.orient.core.metadata.sequence.OSequence.SEQUENCE_TYPE getSequenceType(final com.orientechnologies.orient.core.record.impl.ODocument document) {
    java.lang.String sequenceTypeStr = document.field(com.orientechnologies.orient.core.metadata.sequence.OSequence.FIELD_TYPE);
    if (sequenceTypeStr != null)
        return com.orientechnologies.orient.core.metadata.sequence.OSequence.SEQUENCE_TYPE.valueOf(sequenceTypeStr);
    
    return null;
}