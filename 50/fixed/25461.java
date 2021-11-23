public void createUnableToPayDialog(java.lang.String player, int rentDue) {
    javax.swing.JOptionPane.showMessageDialog(view, "You were unable to pay, and must undevelop!");
    a4.gui.DevelopDialog.createAndShowDevelopDialog(model, view, true);
}