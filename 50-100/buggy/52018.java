private void start() {
    javax.swing.JFrame frame = new javax.swing.JFrame("Knight's Tour!");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.add(new KnightsTourPanel(WIDTH, HEIGHT), java.awt.BorderLayout.CENTER);
    frame.add(new KnightsTourControlPanel(WIDTH, ((HEIGHT) / 3)), java.awt.BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
}