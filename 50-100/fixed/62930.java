private com.google.sprint1.PaintBall getAvailableBall(int id) {
    com.google.sprint1.PaintBall ball;
    currentBall = ((currentBall) + 1) % 5;
    android.util.Log.d("Ball", ("CurrentBall " + (currentBall)));
    ball = com.google.sprint1.GameState.getState().paintBalls.get(((currentBall) + (id * 5)));
    if (!(ball.getGeometry().isVisible()))
        return ball;
    
    return null;
}