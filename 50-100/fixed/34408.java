public void clearPitch() {
    goalKeeperPanel.removeAll();
    defendersPanel.removeAll();
    midfieldersPanel.removeAll();
    strikersPanel.removeAll();
    footerBenchPanel.removeAll();
    goalKeeperPanel.revalidate();
    goalKeeperPanel.repaint();
    midfieldersPanel.revalidate();
    midfieldersPanel.repaint();
    strikersPanel.revalidate();
    strikersPanel.repaint();
    footerBenchPanel.revalidate();
    footerBenchPanel.repaint();
}