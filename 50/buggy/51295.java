public void actionPerformed(java.awt.event.ActionEvent e3) {
    if ((e.getSource()) == Delete) {
        java.lang.String answer = instance.deleteCustomer(cid1, clid1);
        javax.swing.JOptionPane.showMessageDialog(null, answer);
    }
}