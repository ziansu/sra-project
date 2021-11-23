@java.lang.Override
public void operatorControl(org.nashua.tt151.lib.F310 drive, org.nashua.tt151.lib.F310 arm) {
    double mult = getMultiplier(arm);
    double shoulder2 = (arm.getLeftY()) * mult;
    double elbow2 = (arm.getRightY()) * mult;
    if (arm.getButton(F310.Button.LEFT_BUMPER)) {
        setShoulder((-0.125));
    }else {
        setShoulder(shoulder2);
    }
    if (arm.getButton(F310.Button.RIGHT_BUMPER)) {
        setElbow(0.125);
    }else {
        setElbow(elbow2);
    }
}