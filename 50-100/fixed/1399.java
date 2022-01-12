private void jButton_Huy_THDActionPerformed(java.awt.event.ActionEvent evt) {
    int i = javax.swing.JOptionPane.showConfirmDialog(jMenu1, "Bạn có chắc chắn muốn hủy hóa đơn, việc này sẽ xóa những gì đã làm?", "Xác nhận", javax.swing.JOptionPane.YES_NO_OPTION);
    if (i == (javax.swing.JOptionPane.YES_OPTION)) {
        if ((GUI.TAOHOADONGUI.jTable_Thongtinhoadon_THD.getRowCount()) > 0) {
            GUI.TAOHOADONGUI.Xoa_Hoadon();
            GUI.TAOHOADONGUI.Load_data_TableSach_THD();
        }else {
            javax.swing.JOptionPane.showMessageDialog(jMenu1, "Không có gì để hủy, hóa đơn trống", "Thông báo", GUI.TAOHOADONGUI.m);
        }
    }
}