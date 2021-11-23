public com.decimatepvp.entities.WitherBoss spawnWitherBoss(org.bukkit.Location location) {
    com.decimatepvp.entities.WitherBoss boss = new com.decimatepvp.entities.WitherBoss(location.getWorld());
    boss.spawn(location);
    return boss;
}