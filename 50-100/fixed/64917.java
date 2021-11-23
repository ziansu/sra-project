private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    if (((stoichiometryField.getText().length()) == 0) || ((kineticsField.getText().length()) == 0)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter both stoichiometry and kinetics", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return ;
    }
    setStoichiometry();
    jTextArea1.insert("Stoichiometry was succesfully updated. \n", 0);
    setKinetics();
    jTextArea1.insert("Kinetics were succesfully updated. \n", 0);
}