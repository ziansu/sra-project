@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    java.lang.Object source = ae.getSource();
    if (source == (btnHelp)) {
        new com.innotec.bats.client.atm.accountholder.view.HelpShowFile(framePanel, new javax.swing.ImageIcon("resources/Help File Withdrawal.jpg"), accountHolder);
    }
    if (source == (btnCancel)) {
        new com.innotec.bats.client.atm.accountholder.view.ATMAccountHolderMainMenu(framePanel, accountHolder);
    }
}