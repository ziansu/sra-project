public static java.util.Vector getOrthogonalVector(java.util.Vector axis, double degrees, double length) {
    java.util.Vector ortho = new java.util.Vector(axis.getY(), (-(axis.getX())), 0);
    ortho = ortho.normalize();
    ortho = ortho.multiply(length);
    return com.projectkorra.projectkorra.GeneralMethods.rotateVectorAroundVector(axis, ortho, degrees);
}