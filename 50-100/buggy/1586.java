@java.lang.Override
void doIt(float tpf) {
    logo3d.desktop.TurtleControl.LOG.debug("current slerp: {}, tpf {} , speed {}", currentSlerp, tpf, activeDirection.speedCoefficient);
    currentSlerp += tpf * (activeDirection.speedCoefficient);
    com.jme3.math.Quaternion thisRotation = new com.jme3.math.Quaternion();
    thisRotation.slerp(localRotation, targetRotation, currentSlerp);
    turtle.setLocalRotation(thisRotation);
    if ((currentSlerp) >= 1.0F) {
        direction = targetRotation.getRotationColumn(2);
        turtle.setLocalRotation(targetRotation);
        setDone(true);
    }
}