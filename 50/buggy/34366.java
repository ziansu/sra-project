public void update(int deltaTime) {
    team1.updatePlayers(deltaTime);
    team2.updatePlayers(deltaTime);
    ball.update(deltaTime);
    ball.updatePossession();
    checkBallOutOfBounds();
}