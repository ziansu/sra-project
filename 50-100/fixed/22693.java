public static void Xoa_Hoadon() {
    javax.swing.table.DefaultTableModel thismodel = ((javax.swing.table.DefaultTableModel) (GUI.TAOHOADONGUI.jTable_Thongtinhoadon_THD.getModel()));
    int rows = thismodel.getRowCount();
    for (int i = rows - 1; i >= 0; i--) {
        thismodel.removeRow(i);
    }
    GUI.TAOHOADONGUI.jLabel_Tongtienhang.setText("0");
    GUI.TAOHOADONGUI.jLabel_TongSL.setText("0");
}