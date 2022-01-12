public omnikryptec.entity.GameObject removeGameObject(omnikryptec.entity.GameObject g) {
    if (g != null) {
        if ((g.getMyChunk()) != null) {
            g.getMyChunk().removeGameObject(g);
        }else {
            tmp = omnikryptec.main.Scene.xyzToString(g.getChunkX(), g.getChunkY(), g.getChunkZ());
            scene.get(tmp).removeGameObject(g);
        }
    }
    return g;
}