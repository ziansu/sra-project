private static void verifyIntegrity(java.util.List<codng.hgx.ChangeSet> changeSets) {
    for (int i = 0; i < (changeSets.size()); i++) {
        codng.hgx.ChangeSet c = changeSets.get(i);
        if ((c.id.seqNo) != i) {
            throw new java.lang.IllegalStateException(((("Non sequential history? " + i) + " -> ") + (c.id)));
        }
    }
}