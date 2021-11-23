@java.lang.Override
public void onSequenceDropped(final com.orientechnologies.orient.core.record.impl.ODocument iDocument) {
    java.lang.String name = com.orientechnologies.orient.core.metadata.sequence.OSequence.getSequenceName(iDocument);
    if (name == null)
        return ;
    
    name = name.toUpperCase();
    validateSequenceExists(name);
    sequences.remove(name);
}