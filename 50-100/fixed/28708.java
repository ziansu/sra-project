public void turnSync(double turnAngle, double epsilon) {
    turn(turnAngle);
    double feedback;
    do {
        feedback = update();
        java.lang.Thread.yield();
    } while ((java.lang.Math.abs(getHeadingError())) > epsilon );
    stop();
}