public void actionPerformed(java.awt.event.ActionEvent evt) {
    javax.swing.JComboBox<java.lang.String> cb = ((javax.swing.JComboBox<java.lang.String>) (evt.getSource()));
    selectedEmployee = cb.getSelectedIndex();
    java.lang.System.out.println(selectedEmployee);
}