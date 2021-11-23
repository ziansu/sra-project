private void interpretPlayerMoves(float deltaTime) {
    handlePlayerInput(deltaTime);
    timerForPlayerTurn += deltaTime;
    if ((timerForPlayerTurn) >= 5) {
        switchToNextPlayer();
        timerForPlayerTurn -= 5.0F;
    }
}