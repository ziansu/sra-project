private void calcStat(double tt, double currTime) {
    received(1);
    period(currTime);
    deviation();
    jitter(tt);
    delay(tt);
}