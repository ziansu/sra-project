private void initWindow() {
    sp = new minesweeper.SettingsPanel();
    sp.setPreferredSize(new java.awt.Dimension(200, 200));
    this.setContentPane(sp);
    this.setPreferredSize(sp.getPreferredSize());
    this.setTitle("Settings");
    this.setLocation(new java.awt.Point(100, 100));
    this.setResizable(false);
    this.pack();
    this.setVisible(false);
}