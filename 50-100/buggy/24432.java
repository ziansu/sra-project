public void updateEntityList() {
    for (org.bukkit.entity.Entity ent : mobsToRemove) {
        health.remove(ent);
        mobs.remove(ent);
    }
    if (((mobs.size()) < 1) && ((zombiesSpawned) == (zombiesToSpawn))) {
        game.nextWave();
    }
}