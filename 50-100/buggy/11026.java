public static void setPollution(double newPollution, net.minecraft.world.World world, net.minecraft.util.math.BlockPos chunkPos) {
    if ((newPollution < (PollutionDataValue.minPollutionLevel)) || (newPollution > (PollutionDataValue.maxPollutionLevel))) {
        return ;
    }else {
        miguknamja.pollution.data.PollutionDataValue value = new miguknamja.pollution.data.PollutionDataValue(newPollution);
        miguknamja.pollution.ChunkKey key = miguknamja.pollution.ChunkKey.getKey(world, chunkPos);
        miguknamja.pollution.data.PollutionWorldData instance = miguknamja.pollution.data.PollutionWorldData.get(world);
        instance.hashMap.put(key, value);
        instance.markDirty();
    }
}