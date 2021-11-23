public static org.bukkit.util.Vector getOrthogonalVector(org.bukkit.util.Vector axis, double degrees, double length) {
    org.bukkit.util.Vector ortho = new org.bukkit.util.Vector(axis.getY(), (-(axis.getX())), 0);
    ortho = ortho.normalize();
    ortho = ortho.multiply(length);
    return com.projectkorra.projectkorra.GeneralMethods.rotateVectorAroundVector(axis, ortho, degrees);
}