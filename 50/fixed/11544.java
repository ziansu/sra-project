private static void textPaneSettings(javax.swing.JTextPane outputDisplay) {
    outputDisplay.setEditable(false);
    outputDisplay.setFocusable(false);
    outputDisplay.setContentType("text/html");
    outputDisplay.putClientProperty(javax.swing.JTextPane.HONOR_DISPLAY_PROPERTIES, true);
}