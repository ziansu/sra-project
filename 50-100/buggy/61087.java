private void createScrollableTable(javax.swing.JTable table, boolean isSortable) {
    javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane();
    add(scrollPane);
    scrollPane.setViewportView(table);
    table.setFillsViewportHeight(true);
    table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    table.changeSelection(0, 0, false, false);
    if (isSortable) {
        table.setAutoCreateRowSorter(true);
    }
}