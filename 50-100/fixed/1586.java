@java.lang.Override
void doIt(float tpf) {
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