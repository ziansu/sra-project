public com.tommytony.war.Location getBukkitLocation(com.tommytony.war.struct.WarLocation location) {
    com.tommytony.war.World world = this.getServer().getWorld(location.getWorld());
    return new com.tommytony.war.Location(world, location.getX(), location.getY(), location.getZ(), ((float) (location.getYaw())), ((float) (location.getPitch())));
}