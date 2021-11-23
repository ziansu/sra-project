public void addPoints(int points) {
    if (points < 0) {
        return ;
    }
    this.points += points;
    scoreLabel.setText(("Score: " + points));
}