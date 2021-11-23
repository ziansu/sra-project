private void selectTable(java.lang.String selectedTable, org.pentaho.ui.xul.util.AbstractModelList<org.pentaho.agilebi.modeler.models.JoinTableModel> selectedTablesList, java.util.List databaseTables) {
    for (java.lang.Object table : databaseTables) {
        if (table.toString().endsWith(("." + selectedTable))) {
            if (!(selectedTablesList.contains(table))) {
                org.pentaho.agilebi.modeler.models.JoinTableModel joinTable = new org.pentaho.agilebi.modeler.models.JoinTableModel();
                joinTable.setName(table.toString());
                selectedTablesList.add(joinTable);
            }
        }
    }
}