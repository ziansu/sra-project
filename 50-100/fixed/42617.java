private void setupGameOverField() {
    gameOver = new javax.swing.JLabel("Game Over");
    gameOver.setVisible(false);
    gameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    gameOver.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    gameOver.setFont(new java.awt.Font("PixelSplitter-Bold", java.awt.Font.BOLD, 80));
    gameOver.setForeground(new java.awt.Color(44, 165, 124));
    gameOver.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    add(gameOver);
}