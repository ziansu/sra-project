public void clear() {
    int oldSize = rows.size();
    if (oldSize > 0) {
        rows.clear();
        nl.gogognome.lib.swing.AbstractListTableModel.fireTableDataChanged();
    }
}