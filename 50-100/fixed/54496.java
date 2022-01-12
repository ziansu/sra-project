private void deleteuActionPerformed(java.awt.event.ActionEvent evt) {
    int a = javax.swing.JOptionPane.showConfirmDialog(null, "Vill du ta bort denna användare?", "Ta bort", javax.swing.JOptionPane.YES_NO_OPTION);
    if (a == 0) {
        deleteUser();
        cbAnv.removeAllItems();
        fillAnvCB();
        javax.swing.JOptionPane.showMessageDialog(null, "Användare borttagen!");
    }
}