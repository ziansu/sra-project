public omnikryptec.entity.GameObject removeGameObject(omnikryptec.entity.GameObject g, boolean delete) {
    if (g != null) {
        if ((g.getMyChunk()) != null) {
            g.getMyChunk().removeGameObject(g, delete);
        }else {
            tmp = omnikryptec.main.Scene.xyzToString(g.getChunkX(), g.getChunkY(), g.getChunkZ());
            scene.get(tmp).removeGameObject(g, delete);
            g.delete();
        }
    }
    return g;
}