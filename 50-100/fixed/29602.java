private void init() {
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    applet = new me.qcarver.ballsack.Visualization();
    applet.frame = this;
    setResizable(true);
    setLocation(100, 100);
    applet.resize(500, 500);
    applet.setPreferredSize(new java.awt.Dimension(500, 500));
    applet.setMinimumSize(new java.awt.Dimension(500, 500));
    add(applet, java.awt.BorderLayout.CENTER);
    applet.init();
    pack();
    setVisible(true);
}