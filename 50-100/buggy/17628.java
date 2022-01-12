@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);
    mGameFragment = ((org.example.sudoku.GameFragment) (getFragmentManager().findFragmentById(R.id.fragment_game)));
    int restore = getIntent().getIntExtra(org.example.sudoku.GameActivity.KEY_RESTORE, 0);
    if (restore == (-1)) {
        gameData = getPreferences(org.example.sudoku.MODE_PRIVATE).getString(org.example.sudoku.GameActivity.PREF_RESTORE, null);
        if ((gameData) != null) {
            mGameFragment.putState(gameData);
        }
    }
}