public static void init() {
    net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(net.thedragonteam.armorplus.entity.entityzombie.EntityEnderDragonZombie.class, "ender_dragon_zombie", net.thedragonteam.armorplus.entity.ARPEntities.ENDER_DRAGON_ZOMBIE, ArmorPlus.instance, 64, 1000, true, 8704, 65280);
    if (net.thedragonteam.armorplus.ARPConfig.enableEnderDragonZombieSpawnEnd)
        net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(net.thedragonteam.armorplus.entity.entityzombie.EntityEnderDragonZombie.class, 1, 0, 1, EnumCreatureType.MONSTER, Biomes.SKY);
    
    net.minecraft.world.storage.loot.LootTableList.register(EntityEnderDragonZombie.LOOT);
}