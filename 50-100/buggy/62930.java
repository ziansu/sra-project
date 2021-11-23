private com.google.sprint1.PaintBall getAvailableBall(int id) {
    com.google.sprint1.PaintBall ball;
    ball = com.google.sprint1.GameState.getState().paintBalls.get(((currentBall) + (id * 5)));
    currentBall = ((currentBall)++) % 5;
    android.util.Log.d("Ball", ("CurrentBall " + (currentBall)));
    if (!(ball.getGeometry().isVisible()))
        return ball;
    
    return null;
}