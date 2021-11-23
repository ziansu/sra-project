public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JComboBox bx = ((javax.swing.JComboBox) (e.getSource()));
    java.lang.String x = ((java.lang.String) (bx.getSelectedItem()));
    if (x != null) {
        calGUI.AddView.updateDays(dayList, x);
    }
}