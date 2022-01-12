private boolean robotIsParallel() {
    int orientation = controller.getPosition().getOrientation();
    return ((((pi.Utils.isNearDegree(orientation, 90)) || (pi.Utils.isNearDegree(orientation, 180))) || (pi.Utils.isNearDegree(orientation, 270))) || (orientation >= (360 - (pi.Constants.DERIVATION_DEGREE)))) || (orientation <= (0 + (pi.Constants.DERIVATION_DEGREE)));
}