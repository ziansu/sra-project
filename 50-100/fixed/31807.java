@java.lang.Override
protected javax.swing.JTable buildTable(com.vistatec.ocelot.its.ProvenanceTableView.ProvTableModel model) {
    javax.swing.JTable table = super.buildTable(model);
    javax.swing.ListSelectionModel tableSelectionModel = table.getSelectionModel();
    tableSelectionModel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tableSelectionModel.addListSelectionListener(new com.vistatec.ocelot.its.ProvenanceTableView.ProvSelectionHandler());
    table.setRowSorter(new javax.swing.table.TableRowSorter<com.vistatec.ocelot.its.ProvenanceTableView.ProvTableModel>(model));
    return table;
}