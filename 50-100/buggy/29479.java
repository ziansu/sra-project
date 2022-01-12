@java.lang.Override
public float getPriority() {
    float proximity = 0;
    double distance = getCurrentDistanceToStop();
    proximity += java.lang.Math.max(0, (0.2F * ((float) (1 - (distance / 32000)))));
    proximity += java.lang.Math.max(0, (0.8F * ((float) (1 - (distance / 3200)))));
    proximity = java.lang.Math.max(proximity, 0);
    return proximity;
}