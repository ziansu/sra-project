private void initGUI() {
    mainFrame = new javax.swing.JFrame(("JSkat " + (org.jskat.JSkat.getVersion())));
    mainFrame.addWindowListener(new org.jskat.gui.swing.JSkatWindowAdapter(jskat));
    mainFrame.setJMenuBar(getMenuBar());
    final javax.swing.JPanel mainPanel = new javax.swing.JPanel();
    mainPanel.setLayout(new java.awt.BorderLayout());
    if (isBigScreen()) {
        addSymbolPanel(mainPanel);
    }
    addTabbedPane(mainPanel);
    mainFrame.setContentPane(mainPanel);
    setMainFrameParameters();
    mainFrame.pack();
}