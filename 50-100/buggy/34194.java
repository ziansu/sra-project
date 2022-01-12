public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.title = com.develorain.game.Illumination.TITLE;
    config.width = com.develorain.game.Illumination.RESOLUTION_X;
    config.height = com.develorain.game.Illumination.RESOLUTION_Y;
    config.fullscreen = true;
    config.vSyncEnabled = false;
    config.resizable = false;
    config.foregroundFPS = 60;
    config.backgroundFPS = -1;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new com.develorain.game.Illumination(), config);
}