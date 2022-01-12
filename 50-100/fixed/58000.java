public void addDaySelectionButtonListeners(java.awt.event.ActionListener listener) {
    for (int i = 0; i < 4; i++) {
        javax.swing.JPanel dayPanel = ((javax.swing.JPanel) (this.getComponents()[1]));
        javax.swing.JButton button = ((javax.swing.JButton) (dayPanel.getComponents()[i]));
        button.addActionListener(listener);
    }
}