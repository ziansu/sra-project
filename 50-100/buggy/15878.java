@java.lang.Override
public void doFrame() {
    handleTimers();
    frameActions();
    setX(((getX()) + ((front) * (getXSpeed()))));
    setY(((getY()) + (getYSpeed())));
}