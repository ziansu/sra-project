public void createAndShowGUI() {
    frame = new javax.swing.JFrame("New Order") {
        public java.awt.Dimension getMinimumSize() {
            java.awt.Dimension prefSize = getPreferredSize();
            return new java.awt.Dimension(100, prefSize.height);
        }
    };
    frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    addComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
}