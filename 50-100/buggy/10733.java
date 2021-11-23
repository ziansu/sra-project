protected amidst.map.layers.EndCityLayer.ChunkProbability hasSuitableIslandFoundation(amidst.map.Fragment_TheEnd frag, int chunkX, int chunkZ) {
    float requiredInfluence = 60;
    java.util.List<amidst.map.EndIsland> islands = frag.getEndIslands();
    for (amidst.map.EndIsland island : islands) {
        float influence = island.influenceAtChunk(chunkX, chunkZ);
        if (influence >= 0.0) {
            if (influence >= requiredInfluence) {
                return amidst.map.layers.EndCityLayer.ChunkProbability.Likely;
            }else {
                return amidst.map.layers.EndCityLayer.ChunkProbability.Possible;
            }
        }
    }
    return amidst.map.layers.EndCityLayer.ChunkProbability.None;
}