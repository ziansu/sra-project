@java.lang.Override
public int onCollisionHighScoreIncrement() {
    return ((int) (java.lang.Math.max((((element.getSize()) + (element.getSpeed())) - (element.getSize())), 0)));
}