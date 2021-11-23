private static void createAndShowGUI() {
    javax.swing.JFrame frame = new javax.swing.JFrame("MineSweeperSwing");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    game.GameManager gameManager = new game.GameManager(20, 20, 40);
    frame.getContentPane().add(gameManager.getGameBoard());
    frame.pack();
    frame.setMinimumSize(new java.awt.Dimension(1000, 1000));
    frame.setVisible(true);
}