private void init() {
    this.addMouseListener(new java.awt.event.MouseAdapter() {
        @java.lang.Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            _self.requestFocusInWindow();
        }
    });
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @java.lang.Override
        public void componentResized(java.awt.event.ComponentEvent e) {
            _self.repaint();
        }
    });
    this.setLayout(null);
    this.setBackground(java.awt.Color.BLACK);
    _isDebugActive = false;
}