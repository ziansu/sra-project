public void addRow(java.lang.Integer ID, java.lang.String name) {
    if (!(playerIDs.contains(ID))) {
        playerIDs.add(ID);
        playerList.add(name);
        fireTableRowsInserted(((playerList.size()) - 1), ((numcols) - 1));
        (numrows)++;
    }
}