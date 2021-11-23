@java.lang.Override
protected javax.swing.JTable buildTable(javax.swing.table.TableModel model) {
    javax.swing.JTable table = super.buildTable(model);
    javax.swing.ListSelectionModel tableSelectionModel = table.getSelectionModel();
    tableSelectionModel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    tableSelectionModel.addListSelectionListener(new com.vistatec.ocelot.its.LanguageQualityIssueTableView.LQISelectionHandler());
    javax.swing.table.TableRowSorter<com.vistatec.ocelot.its.LanguageQualityIssueTableView.LQITableModel> sort = new javax.swing.table.TableRowSorter<com.vistatec.ocelot.its.LanguageQualityIssueTableView.LQITableModel>(((com.vistatec.ocelot.its.LanguageQualityIssueTableView.LQITableModel) (model)));
    table.setRowSorter(sort);
    table.addMouseListener(new com.vistatec.ocelot.its.LanguageQualityIssueTableView.LQIPopupMenuListener());
    return table;
}