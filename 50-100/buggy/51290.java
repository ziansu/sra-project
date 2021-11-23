public static org.bukkit.Location getLeftSide(org.bukkit.Location location, double distance) {
    float angle = (location.getYaw()) / 60;
    return location.clone().add(new org.bukkit.util.Vector(java.lang.Math.cos(angle), 0, java.lang.Math.sin(angle)).normalize().multiply(distance));
}