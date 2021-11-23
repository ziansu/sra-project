private boolean robotIsParallel() {
    int orientation = controller.getPosition().getOrientation();
    return (((pi.Utils.isNearDegree(90, orientation)) || (pi.Utils.isNearDegree(180, orientation))) || (pi.Utils.isNearDegree(270, orientation))) || (pi.Utils.isNearDegree(0, orientation));
}