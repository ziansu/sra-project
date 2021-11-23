private void printOut(float dtime) {
    if ((orientationprintouttimer) > (org.collabthings.environment.impl.ReallySimpleSuperheroRobot.ORIENTATION_PRINTOUT)) {
        debugInfo(dtime);
        orientationprintouttimer = 0;
    }
}