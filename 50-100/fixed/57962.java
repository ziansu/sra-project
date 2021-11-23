@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("You Lost Loser");
    timer.stop();
    count = 0;
    int n = javax.swing.JOptionPane.showOptionDialog(null, "LOSER! Return to Main Menu?!", "LOSER!", javax.swing.JOptionPane.YES_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, null, null);
    if (n == 0) {
        mFrame.switchToMain(mainJPanel);
    }
}