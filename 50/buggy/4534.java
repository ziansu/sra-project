@java.lang.Override
public void followSpeed() {
    referenceSpeed += st_ep;
    if ((referenceSpeed) < 0)
        referenceSpeed = 0;
    
    enforceSpeedLimit();
}