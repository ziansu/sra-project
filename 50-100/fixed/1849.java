private void setColour(java.awt.Color background, java.awt.Color foreground, java.awt.Color text) {
    for (vtp5.gui.VTP5Button b : buttonList) {
        b.setForeground(foreground);
        b.setBackground(background);
        b.revalidate();
        b.repaint();
    }
    promptLabel.setForeground(text);
    statsList.setForeground(text);
    guessedAnswersList.setForeground(text);
    finishPanel.setTextColour(text);
}