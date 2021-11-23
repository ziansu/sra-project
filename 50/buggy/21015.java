@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JDialog dialog = new org.tinymediamanager.ui.dialogs.BugReportDialog();
    dialog.setLocationRelativeTo(org.tinymediamanager.ui.MainWindow.getActiveInstance());
    dialog.setVisible(true);
    dialog.pack();
}