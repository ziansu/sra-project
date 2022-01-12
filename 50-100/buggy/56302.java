@java.lang.Override
public void onGameFinished(int rank, int score) {
    presenter.newGame();
    dialogHelper.createOkOnlyDialog(getString(R.string.memory_game_dialog_title_game_finished), getString(R.string.memory_game_dialog_text_game_finished, score, rank), new android.content.DialogInterface.OnClickListener() {
        public void onClick(android.content.DialogInterface dialog, int id) {
            navigator.goToHighScores();
        }
    });
}