@java.lang.Override
public void componentHidden(java.awt.event.ComponentEvent arg0) {
    if ((modelNewDBTable) != null) {
        for (int i = 0; i < (modelNewDBTable.getRowCount()); ++i) {
            modelNewDBTable.removeRow(i);
        }
        mn_rows.setEnabled(false);
    }
}