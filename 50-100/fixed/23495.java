public static void main(java.lang.String[] arg) {
    com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration config = new com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration();
    config.title = "Sudoku Helper";
    config.resizable = false;
    config.height = 1920 / 2;
    config.width = 1080 / 2;
    new com.badlogic.gdx.backends.lwjgl.LwjglApplication(new com.thirteensecondstoburn.Sudoku.SudokuGame(true), config);
}