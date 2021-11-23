public static com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData get(net.minecraft.world.World world, @javax.annotation.Nullable
net.minecraft.server.management.PlayerProfileCache playerCache) {
    com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData.cache = playerCache;
    net.minecraft.world.storage.MapStorage storage = world.getMapStorage();
    com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData data = ((com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData) (storage.getOrLoadData(com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData.class, com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData.PLAYER_DIM_ID)));
    if (data == null) {
        data = new com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData();
        storage.setData(com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData.PLAYER_DIM_ID, data);
    }
    com.Da_Technomancer.crossroads.dimensions.PlayerDimensionMapSavedData.cache = null;
    return data;
}