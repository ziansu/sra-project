public com.valkryst.VTerminal.Panel build() throws java.lang.IllegalStateException {
    checkState();
    final com.valkryst.VTerminal.Panel panel = new com.valkryst.VTerminal.Panel(this);
    if ((frame) == null) {
        frame = new javax.swing.JFrame();
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    panel.createBufferStrategy(2);
    panel.setIgnoreRepaint(true);
    panel.setFocusable(true);
    return panel;
}