void loadConfig(com.b3dgs.lionengine.core.Media media) {
    final com.b3dgs.lionengine.game.map.Minimap minimap = WorldModel.INSTANCE.getMinimap();
    if (media.getFile().isFile()) {
        minimap.loadPixelConfig(media);
        minimap.prepare();
        render(gc, minimap);
    }
}