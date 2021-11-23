public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.title = "Try and Catch v0.0.1";
    config.width = 1280;
    config.height = 720;
    config.resizable = true;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new com.game.Main(), config);
}