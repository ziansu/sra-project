@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JOptionPane areYouSure = new javax.swing.JOptionPane();
    cursorMover.mouseMove(((int) ((screenSize.getWidth()) / 2.0)), ((int) ((screenSize.getHeight()) / 2.0)));
    int areYouSureSelection = areYouSure.showConfirmDialog(null, "Do you really want to exit? All unsaved progress will be lost.", "Warning", javax.swing.JOptionPane.YES_NO_OPTION);
    if (areYouSureSelection == (javax.swing.JOptionPane.YES_OPTION))
        java.lang.System.exit(0);
    else {
    }
}