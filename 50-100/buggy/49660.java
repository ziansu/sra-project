public static void textAreaSettings(javax.swing.JTextArea cmdDisplay) {
    cmdDisplay.setColumns(20);
    cmdDisplay.setLineWrap(true);
    cmdDisplay.setRows(5);
    cmdDisplay.setWrapStyleWord(true);
    cmdDisplay.setEditable(false);
    cmdDisplay.setFocusable(false);
    cmdDisplay.setBackground(java.awt.Color.BLACK);
    cmdDisplay.setForeground(java.awt.Color.WHITE);
    cmdDisplay.setFont(new java.awt.Font(java.awt.Font.MONOSPACED, java.awt.Font.BOLD, 12));
}