public boolean isInside(org.bukkit.Location l) {
    return (l.toVector().isInAABB(org.bukkit.util.Vector.getMinimum(v1, v2), org.bukkit.util.Vector.getMaximum(v1, v2).add(new org.bukkit.util.Vector(1, 1, 1)))) && (l.getWorld().getName().equals(world));
}