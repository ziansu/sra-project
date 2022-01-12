public static int existsInTable(javax.swing.JTable table, java.lang.String name) {
    int rowCount = table.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        if ((table.getValueAt(i, 0).toString()) == name) {
            return i;
        }
    }
    return -1;
}