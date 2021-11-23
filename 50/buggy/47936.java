@java.lang.Override
protected java.lang.Void doInBackground() throws java.lang.Exception {
    recording.get_artwork(type, dimension);
    ((javax.swing.table.DefaultTableModel) (table.getModel())).fireTableCellUpdated(row, column);
    return null;
}