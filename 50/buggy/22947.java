public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new me.boxcubed.main.TopDown(), config);
    config.resizable = true;
    config.height = 1000;
    config.width = 720;
}