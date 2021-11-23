private void calcStat(double tt, double currTime) {
    received(1);
    period(currTime);
    deviation();
    delay(tt);
    jitter(tt);
}