@java.lang.Override
public void followSpeed() {
    if ((referenceSpeed) < 0) {
        referenceSpeed = 0;
    }else {
        referenceSpeed += step;
        if ((referenceSpeed) < 0)
            referenceSpeed = 0;
        
    }
    enforceSpeedLimit();
}