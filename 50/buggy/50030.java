public void error(java.lang.String message) {
    javax.swing.ImageIcon errorIcon = loadIcon((("icons" + (slash())) + "icon_error.png"));
    javax.swing.JOptionPane.showMessageDialog(frame, message, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE, errorIcon);
}