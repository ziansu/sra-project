@java.lang.Override
public void showUi() {
    this.setSize(de.uniluebeck.imis.casi.ui.simplegui.MainViewSimpleGui.WIDTH, de.uniluebeck.imis.casi.ui.simplegui.MainViewSimpleGui.HEIGHT);
    this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setLayout(new java.awt.BorderLayout());
    this.setTitle("CASi (MACK Simulator)");
    this.setComponents();
    this.viewMenu.setViewlistener(simPanel.getViewMenuListener());
    this.setVisible(true);
    this.simPanel.paintSimulationComponents();
    de.uniluebeck.imis.casi.ui.simplegui.MainViewSimpleGui.log.info("Show simple GUI");
}