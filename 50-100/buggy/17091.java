@java.lang.Override
public void componentHidden(java.awt.event.ComponentEvent arg0) {
    for (int i = 0; i < (modelNewDBTable.getRowCount()); ++i) {
        modelNewDBTable.removeRow(i);
    }
    modelNewDBTable.addRow(new java.lang.Object[]{  });
    mn_rows.setEnabled(false);
}