public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.title = "Life--";
    config.width = 1440;
    config.height = 810;
    com.badlogic.gdx.backends.lwjgl.LwjglApplication game = new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new com.lifemm.game.LifeMM(), config);
    java.lang.System.out.println(game.toString());
}