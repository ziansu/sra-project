@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((passcodeEntered.length()) == 4)
        resetEntered();
    
    passcodeEntered += e.getActionCommand();
    setEntered(passcodeEntered);
    if ((temporal) != null) {
        temporal.repaint();
    }
}