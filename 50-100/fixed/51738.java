public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.resizable = false;
    config.width = 800;
    config.height = 600;
    config.title = " ";
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new octa.shapes.ShapesGame(), config);
}