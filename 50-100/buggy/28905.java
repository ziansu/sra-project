public static void main(java.lang.String[] args) {
    javax.swing.JFrame frame = new javax.swing.JFrame();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    frame.setSize(main.learnUtils.noGraphics.FastLearner.WIDTH, main.learnUtils.noGraphics.FastLearner.HEIGHT);
    frame.setLocationRelativeTo(null);
    main.game.Keyboard keyboard = main.game.Keyboard.getInstance();
    frame.addKeyListener(keyboard);
    main.learnUtils.noGraphics.FastGamePanel panel = new main.learnUtils.noGraphics.FastGamePanel(new main.learnUtils.LearnGame(main.learnUtils.noGraphics.FastLearner.startValuesForQFile));
    frame.add(panel);
}