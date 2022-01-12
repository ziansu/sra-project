private void newApp() {
    app.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    app.setLayout(new java.awt.FlowLayout());
    app.setSize(600, 600);
    app.setLocation(800, 400);
    app.setTitle("Yet Another Tetris Clone");
    app.addKeyListener(new applogic.UserInputListener(this.playingFieldGUI));
    app.add(playingFieldGUI);
    app.add(new gui.NextTetriminoGUI(playingFieldGUI));
    scoreLabel = new javax.swing.JLabel(getScore());
    app.add(scoreLabel);
}