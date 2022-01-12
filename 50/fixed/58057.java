@java.lang.Override
public void begin(com.badlogic.gdx.graphics.Camera camera, com.badlogic.gdx.graphics.g3d.utils.RenderContext context) {
    this.camera = camera;
    program.begin();
    program.setUniformf(uColor, color);
}