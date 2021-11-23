@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if ((result != null) && ((result.length()) > 0)) {
        mSolution = result;
        invalidateOptionsMenu();
        mPlayback = true;
        mPlaybackBoard = ((yass.Board) (mBoard.clone()));
        mPlaybackSolutionPosition = 0;
        playbackSolution();
        updateToolbar();
        android.content.Intent resultIntent = new android.content.Intent();
        resultIntent.putExtra("SOLUTION", result);
        setResult(yass.RESULT_OK, resultIntent);
    }
    mDialog.dismiss();
}