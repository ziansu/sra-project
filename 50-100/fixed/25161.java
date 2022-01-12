private void createUIComponents() {
    java.lang.Object[][] rowData = new java.lang.Object[0][6];
    java.lang.Object[] columnNames = new java.lang.Object[]{ "Proprietar" , "Nr. inmatriculare" , "Nr. Telefon." , "Firma" , "Email" , "Data exp. tahograf" , "Data exp. ITP" };
    this.carsTable = new javax.swing.JTable(new org.phantom.notificator.gui.ViewCars.NonEditableTableModel(rowData, columnNames));
    this.carsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    this.carsTable.setAutoCreateRowSorter(true);
    refreshCarsTable();
}