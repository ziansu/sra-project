public static void replaceNullWithEmpty(javax.swing.JTable table) {
    for (int i = 0; i < (table.getColumnCount()); i++) {
        for (int j = 0; j < (table.getRowCount()); j++) {
            if ((table.getValueAt(j, i)) != null) {
                if (table.getValueAt(j, i).equals("null")) {
                    table.setValueAt("", j, i);
                }
            }
        }
    }
}