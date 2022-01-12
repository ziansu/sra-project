@java.lang.Override
public com.orientechnologies.orient.core.metadata.sequence.OSequence getSequence(java.lang.String iName) {
    final java.lang.String name = iName.toUpperCase(java.util.Locale.ENGLISH);
    com.orientechnologies.orient.core.metadata.sequence.OSequence seq = sequences.get(name);
    if (seq == null) {
        load();
        seq = sequences.get(name);
    }
    if (seq != null) {
        seq.bindOnLocalThread();
        seq.checkForUpdateToLastversion();
    }
    return seq;
}