public void setActivePanel(javax.swing.JPanel panel) {
    prevPanel = activePanel;
    if ((activePanel) != null) {
        getContentPane().remove(activePanel);
    }
    getContentPane().add(panel, java.awt.BorderLayout.CENTER);
    activePanel = panel;
    pack();
    repaint();
}