public void collision() {
    frame.GameFrame.puck.checkCollisionPlayer(frame.GameFrame.paint.player1);
    frame.GameFrame.puck.checkCollision(Paint.width, Paint.height, Paint.goalY, Paint.diameterPlayer);
}