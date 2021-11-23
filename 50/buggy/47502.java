public void clear() {
    int oldSize = rows.size();
    rows.clear();
    nl.gogognome.lib.swing.AbstractListTableModel.fireTableDataChanged();
}