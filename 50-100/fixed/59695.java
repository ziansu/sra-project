public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String name = nameField.getText();
    java.lang.String balance = balanceField.getText();
    banking.primitive.core.Account acc = myServer.getAccount(name);
    if ((acc != null) && (acc.withdraw(java.lang.Float.parseFloat(balance)))) {
        java.lang.System.out.println(balance);
        javax.swing.JOptionPane.showMessageDialog(null, "Withdrawal successful");
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "Withdrawal unsuccessful");
    }
}