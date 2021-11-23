private void spawnNpc(org.bukkit.Location location) {
    if (isAwaitingChunkReload()) {
        org.bukkit.Location npcLocation = getNpc().getLocation(com.jcwhatever.nucleus.npc.traits.waypoints.PlannedWaypointsTrait.PlannedWaypoints.NPC_LOCATION);
        assert npcLocation != null;
        com.jcwhatever.nucleus.utils.coords.Coords2Di chunkCoords = com.jcwhatever.nucleus.utils.coords.ChunkUtils.getChunkCoords(npcLocation, com.jcwhatever.nucleus.npc.traits.waypoints.PlannedWaypointsTrait.PlannedWaypoints.CHUNK_COORDS);
        npcLocation.getWorld().loadChunk(chunkCoords.getX(), chunkCoords.getZ());
    }else {
        setAwaitingRespawn(com.jcwhatever.nucleus.npc.traits.waypoints.PlannedWaypointsTrait.PlannedWaypoints.AwaitRespawnReason.INVOKED);
        getNpc().spawn(location);
    }
}