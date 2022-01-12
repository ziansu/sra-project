@java.lang.Override
public double distanceSquared(com.kylantraynor.civilizations.shapes.Shape s) {
    if (s.getLocation().getWorld().equals(getLocation().getWorld()))
        return java.lang.Double.POSITIVE_INFINITY;
    
    if (intersect(s))
        return 0.0;
    
    double distanceSquared = distanceSquared(s.getLocation());
    if (exists()) {
        for (org.bukkit.Location l : s.getVertices()) {
            distanceSquared = java.lang.Math.min(distanceSquared(l), distanceSquared);
        }
    }
    return distanceSquared;
}