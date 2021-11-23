@java.lang.Override
protected javax.swing.JTable buildTable(javax.swing.table.TableModel model) {
    javax.swing.JTable table = super.buildTable(model);
    javax.swing.ListSelectionModel tableSelectionModel = table.getSelectionModel();
    tableSelectionModel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tableSelectionModel.addListSelectionListener(new com.vistatec.ocelot.its.ProvenanceTableView.ProvSelectionHandler());
    javax.swing.table.TableRowSorter<com.vistatec.ocelot.its.ProvenanceTableView.ProvTableModel> sort = new javax.swing.table.TableRowSorter<com.vistatec.ocelot.its.ProvenanceTableView.ProvTableModel>(((com.vistatec.ocelot.its.ProvenanceTableView.ProvTableModel) (model)));
    table.setRowSorter(sort);
    return table;
}