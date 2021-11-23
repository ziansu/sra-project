public void setChangeTable(final java.util.Map<java.net.URI, java.net.URI> changeTable) {
    assert (changeTable != null) && (!(changeTable.isEmpty()));
    for (final java.util.Map.Entry<java.net.URI, java.net.URI> e : changeTable.entrySet()) {
        assert e.getKey().isAbsolute();
        assert e.getValue().isAbsolute();
    }
    this.changeTable = changeTable;
}