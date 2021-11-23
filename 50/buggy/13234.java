public void initWindow() {
    setFocusableWindowState(false);
    setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
    setLayout(new java.awt.BorderLayout());
    add(renderSurface, java.awt.BorderLayout.CENTER);
    bwyap.utility.logging.Logger.info("Game window initialized.");
}