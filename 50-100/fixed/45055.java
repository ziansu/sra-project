public void obenPanelSetzen() {
    obenPanel.setLayout(new java.awt.GridLayout(1, 1));
    obenPanel.add(suchPanel);
    obenPanel.add(warenKorbButtons.getInWarenKorbLegenButton());
    obenPanel.add(warenKorbButtons.zumWarenKorbButton);
    obenPanel.setVisible(true);
}