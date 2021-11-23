public void clear() {
    userFields.clear();
    knownFields.clear();
    shownColumns = new java.lang.String[0];
    fireTableStructureChanged();
    tickets = new net.bettyluke.tracinstant.data.Ticket[0];
    fireTableDataChanged();
}