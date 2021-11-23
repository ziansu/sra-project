@java.lang.Override
public void begin(com.badlogic.gdx.graphics.Camera camera, com.badlogic.gdx.graphics.g3d.utils.RenderContext context) {
    this.context = context;
    this.context.setDepthTest(GL20.GL_LEQUAL, 0.0F, 1.0F);
    this.context.setDepthMask(true);
    program.begin();
    set(UNIFORM_PROJ_VIEW_MATRIX, camera.combined);
    if ((primitiveType) == (com.badlogic.gdx.graphics.GL20.GL_TRIANGLES)) {
        set(UNIFORM_WIREFRAME, 0);
    }else {
        set(UNIFORM_WIREFRAME, 1);
    }
}