@java.lang.Override
public void render(com.badlogic.gdx.graphics.g3d.Renderable renderable, com.badlogic.gdx.graphics.g3d.Attributes combinedAttributes) {
    updateLFIndex();
    bindConfiguration();
    bindPosition();
    bindProjections();
    bindTexture();
    com.covart.streaming_prototype.StringPool.addField("Camera Position", java.lang.String.format(java.util.Locale.TAIWAN, "X: %4f, Y: %4f, Z: %4f", camera.position.x, camera.position.y, camera.position.z));
    visualizeLightFieldStatus();
    super.render(renderable, combinedAttributes);
}