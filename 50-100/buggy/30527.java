public void setChangeTable(final java.util.Map<java.net.URI, java.net.URI> changeTable) {
    for (final java.util.Map.Entry<java.net.URI, java.net.URI> e : changeTable.entrySet()) {
        assert new java.io.File(e.getKey()).isAbsolute();
        assert new java.io.File(e.getValue()).isAbsolute();
    }
    this.changeTable = changeTable;
}