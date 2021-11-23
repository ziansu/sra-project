private void start() {
    javax.swing.JFrame frame = new javax.swing.JFrame("Knight's Tour!");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.add(new KnightsTourPanel(WIDTH, HEIGHT), java.awt.BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
}