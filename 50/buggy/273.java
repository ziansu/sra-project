@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    int response = javax.swing.JOptionPane.showConfirmDialog(frame, "Do you really want to quit ? ", "LAPLE", javax.swing.JOptionPane.YES_NO_OPTION);
    if (response == (javax.swing.JOptionPane.OK_OPTION)) {
        frame.dispose();
    }
}