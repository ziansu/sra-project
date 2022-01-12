public void render(com.badlogic.gdx.graphics.g3d.Renderable renderable, com.badlogic.gdx.graphics.g3d.Attributes combinedAttributes) {
    super.render(renderable, combinedAttributes);
    if ((scene) != null) {
        program.setUniformf("far", scene.camera.far());
        program.setUniformf("near", scene.camera.near());
    }
}