public void resize(int width, int height) {
    aspectRatio = width / ((float) (height));
    gui.setAspectRatio(aspectRatio);
    Gdx.app.debug("Aspect", ("" + (aspectRatio)));
    camera.viewportWidth = (bg.ittalents.tower_defense.game.WorldRenderer.VIEWPORT) * (aspectRatio);
    camera.update();
    worldController.updateScale();
    scale = worldController.getScale();
}