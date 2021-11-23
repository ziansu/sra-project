@java.lang.Override
void process(long deltaTime, de.pinkproblem.multipong.Ball ball) {
    double dst = (ball.getyPosition()) - (getShieldCenter());
    double dir;
    if (dst >= 0) {
        dir = 1;
    }else {
        dir = -1;
    }
    double maxDst = java.lang.Math.min(((dir * deltaTime) * (velocity)), dst);
    move(maxDst);
}