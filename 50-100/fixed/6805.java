public void removeRows(int[] indices) {
    java.util.Arrays.sort(indices);
    for (int i = (indices.length) - 1; i >= 0; i--) {
        rows.remove(indices[i]);
    }
    nl.gogognome.lib.swing.AbstractListTableModel.fireTableDataChanged();
}