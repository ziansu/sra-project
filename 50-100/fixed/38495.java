public void GenerateSpeed() {
    speed = new java.lang.Double(java.lang.Math.round(((5 * (main.BouncingBall.MAX_SPEED)) / (radius)))).intValue();
    if ((speed) > (main.BouncingBall.MAX_SPEED)) {
        speed = main.BouncingBall.MAX_SPEED;
    }
    double angle = ((java.lang.Math.random()) * 2) * (java.lang.Math.PI);
    speedX = (speed) * (java.lang.Math.cos(angle));
    speedY = (speed) * (java.lang.Math.sin(angle));
}