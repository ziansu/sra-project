private void initPuzzleOrGetFromExtras() {
    android.os.Bundle bundle = getIntent().getExtras();
    if ((bundle != null) && ((bundle.get("Puzzle")) != null)) {
        puzzle = new com.sudoku.puzzlesolver.Puzzle(((java.lang.Integer[][]) (bundle.get("Puzzle"))));
    }else {
        puzzle = new com.sudoku.puzzlesolver.Puzzle();
    }
}