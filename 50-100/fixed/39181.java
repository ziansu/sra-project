protected void createMafPanel(javax.swing.JPanel dataPanel) {
    com.vgi.mafscaling.MafTablePane mafScrollPane = new com.vgi.mafscaling.MafTablePane(com.vgi.mafscaling.AMafScaling.ColumnWidth, com.vgi.mafscaling.AMafScaling.MafTableName, true, true);
    mafTable = mafScrollPane.getJTable();
    excelAdapter.addTable(mafTable, false, false, false, false, false, false, false, false, true);
    java.awt.GridBagConstraints gbc_mafScrollPane = new java.awt.GridBagConstraints();
    gbc_mafScrollPane.ipady = 30;
    gbc_mafScrollPane.anchor = java.awt.GridBagConstraints.PAGE_START;
    gbc_mafScrollPane.insets = insets0;
    gbc_mafScrollPane.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gbc_mafScrollPane.gridx = 0;
    gbc_mafScrollPane.gridy = 1;
    dataPanel.add(mafScrollPane, gbc_mafScrollPane);
}