public net.minecraft.server.v1_8_R3.EntityZombie getEntity(net.minecraft.server.v1_8_R3.World world, org.bukkit.Location location, int id) {
    net.minecraft.server.v1_8_R3.EntityZombie zombie = ((net.minecraft.server.v1_8_R3.EntityZombie) (super.getEntity(world, location, id)));
    zombie.setVillager(isVillager);
    return zombie;
}