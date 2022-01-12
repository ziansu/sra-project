public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.width = 720;
    config.height = 1280;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new com.gravitygame.GravityGame(), config);
}