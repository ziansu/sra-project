private void enforceSpeedLimit() {
    if ((referenceSpeed) > (speedLimit)) {
        referenceSpeed = speedLimit;
    }else
        if ((referenceSpeed) < 0) {
            referenceSpeed = 0;
        }
    
}