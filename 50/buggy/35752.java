@java.lang.Override
public void onNewFile(java.lang.String activeFileName) {
    list.tableFiles.repaint();
    list.tableTotal.repaint();
    modelTotal.fireTableDataChanged();
}