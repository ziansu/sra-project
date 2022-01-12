protected void onDestroy() {
    if (mHasRunCallback) {
        handler.removeCallbacks(runnableShowNextWord);
    }
    if ((!((mTotalTrueAnswers) == 0)) && ((mTotalFalseAnswers) == 0)) {
        android.widget.Toast.makeText(ctx, showResult(), Toast.LENGTH_LONG).show();
    }
    mDb.close();
    super.onDestroy();
}