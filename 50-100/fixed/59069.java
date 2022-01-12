@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (prathameshshetye.minesweeper.generic.Utilities.RESULT_SCORE)) {
        if (resultCode == (RESULT_OK)) {
            mDoShowScore = false;
            showScoreButton(mDoShowScore);
        }
    }
}