public static void main(java.lang.String[] args) {
    roguelike_game.Game game = new roguelike_game.Game();
    game.setSize(1117, 620);
    game.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    game.setLocationRelativeTo(null);
    game.setTitle(game.version);
    game.setVisible(true);
    game.start();
}