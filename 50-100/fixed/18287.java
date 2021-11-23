private static void verifyIntegrity(java.util.List<codng.hgx.ChangeSet> changeSets) {
    final int size = changeSets.size();
    for (int i = 0; i < size; i++) {
        final codng.hgx.ChangeSet c = changeSets.get(i);
        if ((c.id.seqNo) != i) {
            throw new java.lang.IllegalStateException(((("Non sequential history? " + i) + " -> ") + (c.id)));
        }
    }
}