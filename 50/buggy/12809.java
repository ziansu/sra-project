protected void initialize() {
    this.setContentPane(getDesktop());
    this.setTitle("Mixtract");
    this.setPreferredSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
    this.setJMenuBar(getMenubar());
}