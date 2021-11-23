private void onActionStop() {
    actionBar.removeAllActions();
    actionBar.addAction(actionBarActions.get(com.quran.labs.androidquran.QuranViewActivity.ACTION_PLAY), 0);
    actionBar.addAction(actionBarActions.get(com.quran.labs.androidquran.QuranViewActivity.ACTION_CHANGE_READER), 0);
    actionBar.addAction(actionBarActions.get(com.quran.labs.androidquran.QuranViewActivity.ACTION_JUMP_TO_AYAH), 0);
    actionBar.addAction(actionBarActions.get(com.quran.labs.androidquran.QuranViewActivity.ACTION_REPEAT), 0);
    playing = false;
}