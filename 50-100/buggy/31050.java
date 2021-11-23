@java.lang.Override
public void render(float delta) {
    this.camera.zoom = zoom;
    this.level.setCameraPosition();
    this.level.preRender();
    this.particlesStage.getBatch().setColor(startColor);
    this.level.render(delta);
    this.particlesStage.getBatch().setColor(startColor);
    this.level.afterRender();
    box2DDebugRenderer.render(this.level.getWorld(), camera.combined);
}