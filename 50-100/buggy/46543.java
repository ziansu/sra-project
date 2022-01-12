public static void main(java.lang.String[] args) {
    javax.swing.JFrame frame = new javax.swing.JFrame("Pong");
    game.Game game = new game.Game(1, 1);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(game);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}