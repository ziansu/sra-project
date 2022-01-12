public void ballMove(double elapsedTime) {
    ball.setX(((ball.getX()) + (elapsedTime * (ball_speed_horizontal))));
    ball.setY(((ball.getY()) + (elapsedTime * (ball_speed_vertical))));
}