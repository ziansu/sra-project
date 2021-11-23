public void Left() {
    mAngle = +(CRobot.INCREMENT);
    if ((mAngle) >= (CRobot.MAX_ANGLE)) {
        mAngle = CRobot.MIN_ANGLE;
    }
    Place(mProperty.x, mProperty.y, mAngle);
}