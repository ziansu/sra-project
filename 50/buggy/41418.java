@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (validInputs()) {
        save();
        close();
    }
}