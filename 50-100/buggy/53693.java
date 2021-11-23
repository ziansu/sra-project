private void addBalls(int numberOfBallsAdded) {
    for (int i = 0; i < numberOfBallsAdded; i++) {
        int randX = ((int) ((java.lang.Math.random()) * 800));
        int randSpeedX = ((int) ((java.lang.Math.random()) * 20));
        com.jamesku.sample.Ball newBall = new com.jamesku.sample.Ball(randX, 0, 35, android.graphics.Color.WHITE);
        newBall.setSpeedX(randSpeedX);
        newBall.setSpeedY(20);
        com.jamesku.sample.GameScreen.balls.add(newBall);
    }
}