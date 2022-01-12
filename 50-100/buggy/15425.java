@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d(org.example.sudoku.GameFragment.TAG, "onCreate");
    int diff = getActivity().getIntent().getIntExtra(org.example.sudoku.GameActivity.KEY_RESTORE, (-1));
    puzzle = getPuzzle(diff);
    calculateUsedTiles();
    puzzleView = new org.example.sudoku.PuzzleView(this);
    getActivity().setContentView(puzzleView);
    puzzleView.requestFocus();
    getActivity().getIntent().putExtra(org.example.sudoku.GameFragment.KEY_DIFFICULTY, org.example.sudoku.GameFragment.DIFFICULTY_CONTINUE);
}