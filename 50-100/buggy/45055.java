public void obenPanelSetzen() {
    obenPanel.setLayout(new java.awt.GridLayout(1, 1));
    obenPanel.add(suchPanel);
    obenPanel.add(warenKorbButtons.zumWarenKorbButton);
    obenPanel.add(warenKorbButtons.getInWarenKorbLegenButton());
    obenPanel.setVisible(true);
}