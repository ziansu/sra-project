private void loadNetworkMap() {
    panel = drawNetworkMap();
    panel.add(this.executeButton);
    this.setContentPane(panel);
    this.setSize(800, 900);
    this.setVisible(true);
}