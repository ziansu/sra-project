public static org.bukkit.Location getRightSide(org.bukkit.Location location, double distance) {
    float angle = (location.getYaw()) / 60;
    return location.clone().subtract(new org.bukkit.util.Vector(java.lang.Math.cos(angle), 0, java.lang.Math.sin(angle)).normalize().multiply(distance));
}