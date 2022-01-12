private void display_popup(java.lang.String title, java.lang.String message) {
    java.awt.Font font = new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.PLAIN, 20);
    javax.swing.UIManager.put("OptionPane.messageFont", font);
    javax.swing.JFrame popup_parent = new javax.swing.JFrame();
    javax.swing.JOptionPane jpop = new javax.swing.JOptionPane();
    jpop.showOptionDialog(popup_parent, message, title, javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, null, null);
    popup_parent.setVisible(false);
    popup_parent.dispose();
}