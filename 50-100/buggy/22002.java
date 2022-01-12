public void actionPerformed(java.awt.event.ActionEvent e) {
    java.awt.Color selectedColor = javax.swing.JColorChooser.showDialog(null, "Pick a Color", java.awt.Color.YELLOW);
    btnColor.setBackground(selectedColor);
    int newColor = btnColor.getBackground().getRGB();
    defaultNoteColor = java.lang.Integer.toString(newColor);
    saveSettings();
}