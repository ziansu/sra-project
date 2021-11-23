@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    setChoice("1");
    getChoice();
    getUsername();
    getPassword();
    try {
        tryLogin();
    } catch (java.io.IOException e1) {
        javax.swing.JOptionPane.showMessageDialog(testUI, e1);
    }
}