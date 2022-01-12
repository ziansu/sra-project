public void timerFired() {
    tyrone.move();
    checkBallPos(ball);
    handleCollision(tyrone, ball);
    ball.move();
}