public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.resizable = false;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new com.lothbrok.game.Lothbrok(), config);
}