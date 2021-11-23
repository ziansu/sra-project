private static void registerEntity(java.lang.Class<? extends net.minecraft.entity.EntityLiving> clazz, java.lang.String name, net.minecraft.entity.EntityLiving.SpawnPlacementType placementType, int probe, int min, int max, net.minecraft.entity.EnumCreatureType type, net.minecraft.world.biome.Biome... biomes) {
    de.teamlapen.vampirism.core.ModEntities.registerEntity(clazz, name, placementType, true);
    VampirismMod.log.d("EntityRegister", ("Adding spawn with probe of " + probe));
    net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn(clazz, probe, min, max, type, biomes);
}