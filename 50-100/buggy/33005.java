public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.title = "Homorium I";
    config.width = 1280;
    config.height = 800;
    config.vSyncEnabled = true;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(com.widesteppe.Controller.getInstance(), config);
}