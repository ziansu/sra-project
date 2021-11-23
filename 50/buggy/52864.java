public void success(java.lang.String message) {
    javax.swing.ImageIcon successIcon = loadIcon((("icons" + (slash())) + "icon_success.png"));
    javax.swing.JOptionPane.showMessageDialog(frame, message, "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE, successIcon);
}