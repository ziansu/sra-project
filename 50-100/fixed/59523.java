public com.valkryst.VTerminal.Panel build() throws java.lang.IllegalStateException {
    checkState();
    final com.valkryst.VTerminal.Panel panel = new com.valkryst.VTerminal.Panel(this);
    frame.add(panel);
    frame.pack();
    frame.setResizable(false);
    frame.setVisible(true);
    panel.createBufferStrategy(2);
    panel.setIgnoreRepaint(true);
    panel.setFocusable(true);
    return panel;
}