public void removeRowFromTable(int index) {
    ((javax.swing.table.DefaultTableModel) (table.getModel())).removeRow(index);
    java.lang.System.out.println(("row is : " + index));
}