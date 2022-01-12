public static void generateBoardGame(android.content.Context context, int numberOfCells, java.lang.String level) {
    com.android.ejemplos.sudoku.fragments.CellFragment[][] arrayCellFragment = com.android.ejemplos.sudoku.activities.BoardGameActivity.getArrayCellFragment();
    com.android.ejemplos.sudoku.model.Sudoku.clearBoardGame(arrayCellFragment);
    com.android.ejemplos.sudoku.model.Sudoku.printRandomNumberInBoardGame(arrayCellFragment, com.android.ejemplos.sudoku.model.Sudoku.boardGame, numberOfCells);
    com.android.ejemplos.sudoku.fragments.LifeFragment.restartIcons(context);
    com.android.ejemplos.sudoku.model.Sudoku.life_counter = 4;
    com.android.ejemplos.sudoku.activities.BoardGameActivity.setTextLevel(level);
    BoardGameActivity.chronometer.setBase(android.os.SystemClock.elapsedRealtime());
    BoardGameActivity.chronometer.start();
}