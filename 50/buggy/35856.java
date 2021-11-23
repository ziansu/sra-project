public void clearHand() {
    handPane.removeAll();
    handPane.validate();
    handPane.repaint();
    handLabels.clear();
    updatePanels();
}