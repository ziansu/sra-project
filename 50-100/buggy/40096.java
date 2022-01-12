@java.lang.Override
protected void onPause() {
    super.onPause();
    int currentSeekbarVal = mPageSeekbar.getProgress();
    int maxSeekbarVal = mPageSeekbar.getMax();
    if (currentSeekbarVal > 0) {
        android.content.SharedPreferences.Editor editor = mSharedPrefs.edit();
        editor.putInt(((mChapterId) + (com.kaim808.betterreader.activities.ChapterViewingActivity.PROGRESS_MAX)), maxSeekbarVal);
        editor.putInt(((mChapterId) + (com.kaim808.betterreader.activities.ChapterViewingActivity.PROGRESS_VALUE)), currentSeekbarVal);
        editor.apply();
    }
}