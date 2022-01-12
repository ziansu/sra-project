public void triggerExpirence(chanceCubes.rewards.rewardparts.ExpirencePart levels, net.minecraft.world.World world, int x, int y, int z, net.minecraft.entity.player.EntityPlayer player) {
    for (int i = 0; i < (levels.getNumberofOrbs()); i++) {
        net.minecraft.entity.Entity newEnt = new net.minecraft.entity.item.EntityXPOrb(world, x, y, z, ((levels.getAmount()) / (levels.getNumberofOrbs())));
        world.spawnEntityInWorld(newEnt);
    }
}