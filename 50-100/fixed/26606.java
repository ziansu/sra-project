@java.lang.Override
public void tableChanged(javax.swing.event.TableModelEvent e) {
    if (!(deleteEnabled)) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        javax.swing.table.TableModel model = ((javax.swing.table.TableModel) (e.getSource()));
        java.lang.Object data = model.getValueAt(row, column);
        boolean checked = java.lang.Boolean.parseBoolean(data.toString());
        AlarmsR.get(row).setenabled(checked);
    }
    deleteEnabled = false;
}