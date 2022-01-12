public void restartGame() {
    this.instanceGame.getScheduler().restoreSpeed();
    deleteArray(snake);
    deleteArray(foodInBonus);
    matrix[xFood][yFood].setBackground(this.instanceGame.getBackgroundGame());
    matrix[xFood][yFood].setIcon(null);
    startGame();
    this.instanceGame.updateScore(score);
}