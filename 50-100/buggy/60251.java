protected void updateMesh() {
    spatial.detachAllChildren();
    org.shaman.rpg.engine.core.level.Map map = level.getMap();
    org.shaman.rpg.engine.core.level.Chunk[][] chunks = map.getRawChunks();
    for (int x = 0; x < (chunks.length); ++x) {
        for (int y = 0; y < (chunks[x].length); ++y) {
            processChunk(chunks[x][y]);
        }
    }
}