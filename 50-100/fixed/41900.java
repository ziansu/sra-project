private void initWindow() {
    this.setTitle("Settings");
    this.setLocation(new java.awt.Point(100, 100));
    this.setResizable(false);
    sp = new minesweeper.SettingsPanel();
    sp.setPreferredSize(new java.awt.Dimension(200, 200));
    this.setPreferredSize(sp.getPreferredSize());
    this.setContentPane(sp);
    this.pack();
    this.setVisible(false);
}