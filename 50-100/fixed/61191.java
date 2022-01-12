public void resetWorld(org.cyberiantiger.minecraft.instantreset.InstantResetWorld world) {
    world.checkValid();
    java.util.Map<org.bukkit.entity.Player, org.bukkit.Location> players = unloadWorld(world, false);
    world.createWorldSave();
    org.bukkit.World bukkitWorld = loadWorld(world);
    for (org.bukkit.entity.Player player : players.keySet()) {
        player.teleport(bukkitWorld.getSpawnLocation());
    }
    filePurger.start();
}