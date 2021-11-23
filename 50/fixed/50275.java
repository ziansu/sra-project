@java.lang.Override
public void followSpeed() {
    if (((referenceSpeed) + (step)) < 0) {
        referenceSpeed = 0;
    }else {
        referenceSpeed += step;
    }
    enforceSpeedLimit();
}