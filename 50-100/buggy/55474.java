public static void createAndShowGUI() {
    javax.swing.JFrame frame = new javax.swing.JFrame("Welcome!");
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    main.MainGame game = new main.MainGame();
    game.addComponentToPane(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setBackground(java.awt.Color.WHITE);
}