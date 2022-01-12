private javax.swing.JPanel getAssignmentPanel() {
    javax.swing.JPanel assignPanel = new javax.swing.JPanel();
    assignPanel.setLayout(new java.awt.BorderLayout());
    assignPanel.add(new javax.swing.JLabel("<html><p>Assignments:</p></html>"), java.awt.BorderLayout.PAGE_START);
    tableModel = createTableModel();
    assignTable = new javax.swing.JTable(tableModel);
    assignTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    javax.swing.JScrollPane tableScroll = new javax.swing.JScrollPane(assignTable);
    assignPanel.add(tableScroll);
    assignPanel.add(getAssignmentButtonsPanel(), java.awt.BorderLayout.PAGE_END);
    assignTable.setEnabled(false);
    return assignPanel;
}