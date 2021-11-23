public static void main(java.lang.String[] args) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration cfg = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    cfg.title = "Spriter - demo";
    cfg.useGL20 = false;
    cfg.width = 1280;
    cfg.height = 720;
    cfg.resizable = false;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new demo.SpriterDemo(), cfg);
}