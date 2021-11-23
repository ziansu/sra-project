public void actionPerformed(java.awt.event.ActionEvent e) {
    java.awt.Color selectedColor = javax.swing.JColorChooser.showDialog(null, "Pick a Color", java.awt.Color.YELLOW);
    if (selectedColor != null) {
        display.setBackground(selectedColor);
        saveNote(noteFile);
        recreatePopupMenu();
    }
}