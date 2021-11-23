void loadConfig() {
    final com.b3dgs.lionengine.game.map.Minimap minimap = WorldModel.INSTANCE.getMinimap();
    final com.b3dgs.lionengine.core.Media media = com.b3dgs.lionengine.core.Medias.create(config.getText());
    if (media.getFile().isFile()) {
        minimap.loadPixelConfig(media);
        minimap.prepare();
        render(gc, minimap);
    }
}