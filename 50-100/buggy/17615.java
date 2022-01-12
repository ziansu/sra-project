public void saveGame() {
    java.lang.String filename = MainMenuActivity.SAVE_FILE;
    java.lang.String save = com.pinguinson.sudoku.GameEngine.getInstance().saveGrids();
    java.io.FileOutputStream outputStream;
    try {
        outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
        outputStream.write(save.getBytes());
        outputStream.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    android.util.Log.d("SAVE", "successfully saved current game");
}