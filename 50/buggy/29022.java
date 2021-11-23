@java.lang.Override
public void dropSequence(java.lang.String iName) {
    com.orientechnologies.orient.core.metadata.sequence.OSequence seq = getSequence(iName);
    seq.getDocument().delete();
    sequences.remove(iName);
}