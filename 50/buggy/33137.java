public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.width = fr.imac.myrddin.MyrddinGame.WIDTH;
    config.height = fr.imac.myrddin.MyrddinGame.HEIGHT;
    config.resizable = false;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new fr.imac.myrddin.MyrddinGame(), config);
}