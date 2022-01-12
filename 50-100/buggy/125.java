public static int getAngle(de.pvr.fish.simulation.model.Position source, de.pvr.fish.simulation.model.Position target) {
    double angle2 = java.lang.Math.atan2(((target.getCoordinateY()) - (source.getCoordinateY())), ((target.getCoordinateX()) - (source.getCoordinateY())));
    int angle = ((int) (java.lang.Math.toDegrees(angle2)));
    angle = (angle + 180) % 360;
    return angle;
}