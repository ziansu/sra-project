private void evaluate(float interpolatedTime) {
    float timeLeft = 1.0F - interpolatedTime;
    alpha = java.lang.Math.round(((1.0F - interpolatedTime) * 255));
    current.x = doMaths(timeLeft, interpolatedTime, start.x, control.x, end.x);
    current.y = doMaths(timeLeft, interpolatedTime, start.y, control.y, end.y);
}