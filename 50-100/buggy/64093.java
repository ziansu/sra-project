public void setFactTable(org.pentaho.agilebi.modeler.models.JoinTableModel factTable) {
    java.util.List<org.pentaho.agilebi.modeler.models.JoinTableModel> tables = new java.util.ArrayList<org.pentaho.agilebi.modeler.models.JoinTableModel>();
    tables.addAll(this.factTables.getElements());
    this.factTables.setSelectedIndex(tables.indexOf(factTable.getName()));
}