protected void adjustSlopeVelocities(int i1) {
    if ((this) instanceof train.common.api.Locomotive) {
        return ;
    }
    double d4 = -0.002;
    if (i1 == 2) {
        motionX -= d4;
    }
    if (i1 == 3) {
        motionX += d4;
    }
    if (i1 == 4) {
        motionZ += d4;
    }
    if (i1 == 5) {
        motionZ -= d4;
    }
}