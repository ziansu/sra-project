public void actionPerformed(java.awt.event.ActionEvent e) {
    int confirmation = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION);
    if (confirmation == 0) {
        cards.show(cardPanel, "Welcome");
        buttonPanel.setVisible(false);
        lblUser.setText("");
        lblFirst.setText("");
        lblWelcome.setText("Login As Another User");
        thisCar.stopCar();
        thisCar.setCarStopped(true);
    }
}