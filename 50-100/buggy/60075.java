public synchronized void process() throws java.io.IOException, java.lang.InterruptedException {
    javax.swing.JFrame window = new javax.swing.JFrame();
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    window.setSize(((com.snake.Game.baseSize) * (com.snake.Game.height)), ((com.snake.Game.baseSize) * ((com.snake.Game.width) + 1)));
    window.setResizable(false);
    window.setLocationRelativeTo(null);
    window.add(new com.snake.Game());
    window.setVisible(true);
}