@java.lang.Override
public boolean intersect(com.kylantraynor.civilizations.shapes.Shape s) {
    if (s.getLocation().getWorld().equals(getLocation().getWorld()))
        return false;
    
    for (org.bukkit.Location l : s.getBlockLocations()) {
        if (isInside(l))
            return true;
        
    }
    return false;
}