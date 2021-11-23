private javax.swing.JTable createJTable() {
    java.lang.String[] header = new java.lang.String[]{ "X" , "Y" , "Width" , "Height" };
    CanvasTableModel model = new CanvasTableModel(header, 0);
    javax.swing.JTable newTable = new javax.swing.JTable(model);
    try {
        newTable.setAutoCreateRowSorter(true);
    } catch (java.lang.Exception continuewithNoSort) {
    }
    newTable.setBorder(new javax.swing.border.MatteBorder(1, 1, 1, 1, java.awt.Color.BLACK));
    newTable.setSize(400, 200);
    return newTable;
}