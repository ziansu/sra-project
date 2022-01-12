private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
    if ((bookstoremanagerment.MainForm.b) == 0) {
        bookstoremanagerment.MainForm.fx2 = new bookstoremanagerment.Form_ThongkeDoanhthu();
        bookstoremanagerment.MainForm.fx2.setVisible(true);
        bookstoremanagerment.MainForm.b = 1;
    }else
        if ((bookstoremanagerment.MainForm.b) == 1) {
            javax.swing.JOptionPane.showMessageDialog(menu, "Cửa sổ vẫn đang mở!!!", "Lỗi", java.awt.image.ImageObserver.WIDTH);
        }
    
}