@java.lang.Override
public void onNewFile(java.lang.String activeFileName) {
    if ((list) != null) {
        list.tableFiles.repaint();
        list.tableTotal.repaint();
        modelTotal.fireTableDataChanged();
    }
}