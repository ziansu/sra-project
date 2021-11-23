@java.lang.Override
public void run() {
    com.acme.server.world.Area spawnArea = worldManager.getWorld().getPlayerSpawnAreas().get(checkpointId);
    if (spawnArea != null) {
        pcm.get(getClient()).setSpawnArea(spawnArea);
    }
}