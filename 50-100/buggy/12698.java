@java.lang.Override
protected int intSpeed(float fSpeed) {
    int speed = super.intSpeed(fSpeed);
    if (speed <= 0) {
        return speed;
    }
    switch (this.getSpeedStepMode()) {
        case jmri.DccThrottle.SpeedStepMode28 :
        case jmri.DccThrottle.SpeedStepMode28Mot :
            return ((int) ((fSpeed * 28) * 4)) + 12;
        case jmri.DccThrottle.SpeedStepMode14 :
            return ((int) ((fSpeed * 14) * 8)) + 8;
    }
    return speed;
}