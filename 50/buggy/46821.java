public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.width = 1920;
    config.height = 1080;
    config.fullscreen = false;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new de.johannesbade.kletterhoelle.KletterHoelle(), config);
}