public static void main(java.lang.String[] args) {
    amazeing.Game game = new amazeing.Game();
    game.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    game.setVisible(true);
    game.setTitle("aMAZEing");
    game.setSize(amazeing.AMAZEing.WIDTH, amazeing.AMAZEing.HEIGHT);
    game.setResizable(false);
    while (true) {
        try {
            game.updateStatistics();
            game.executeQueue();
            game.checkEndLevel();
        } catch (java.lang.Exception ex) {
        }
    } 
}