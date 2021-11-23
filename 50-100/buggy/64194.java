private belven.arena.MobToMaterialCollecton MatToMob(org.bukkit.Material mat) {
    belven.arena.MobToMaterialCollecton spawnMats = new belven.arena.MobToMaterialCollecton();
    spawnMats.Add(EntityType.ZOMBIE, mat);
    spawnMats.Add(EntityType.SKELETON, mat);
    spawnMats.Add(EntityType.SPIDER, mat);
    spawnMats.Add(EntityType.SLIME, mat);
    spawnMats.Add(EntityType.CAVE_SPIDER, mat);
    return spawnMats;
}