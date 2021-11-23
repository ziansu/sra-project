@java.lang.Override
public void windowResized(int width, int height) {
    map.getCamera().setOrthographic(0, width, height, 0, (-1), 1);
    org.lwjgl.opengl.GL11.glViewport(0, 0, width, height);
    if (map.hasBackground()) {
        ((run.wraith.engine.mapstyles.iso.BackgroundImageModel) (map.getBackground().getModel())).resize(width, height);
    }
}