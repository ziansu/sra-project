public com.orientechnologies.orient.core.metadata.sequence.OSequence getSequence(final com.orientechnologies.orient.core.db.ODatabaseDocumentInternal database, final java.lang.String iName) {
    final java.lang.String name = iName.toUpperCase(java.util.Locale.ENGLISH);
    com.orientechnologies.orient.core.metadata.sequence.OSequence seq = sequences.get(name);
    if (seq == null) {
        load(database);
        seq = sequences.get(name);
    }
    if (seq != null) {
        seq.bindOnLocalThread();
    }
    return seq;
}