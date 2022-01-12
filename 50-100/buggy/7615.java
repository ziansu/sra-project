public void setup(final java.util.Map<java.net.URI, java.net.URI> conflictTable) {
    for (final java.util.Map.Entry<java.net.URI, java.net.URI> e : changeTable.entrySet()) {
        assert new java.io.File(e.getKey()).isAbsolute();
        assert new java.io.File(e.getValue()).isAbsolute();
    }
    this.conflictTable = conflictTable;
}