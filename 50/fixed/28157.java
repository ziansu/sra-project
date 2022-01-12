private void initializeLayoutPane() {
    if ((findViewById(R.id.verse_container)) != null) {
        tz.co.wadau.bibiliatakatifu.BibleActivity.mTwoPane = true;
    }else {
        tz.co.wadau.bibiliatakatifu.BibleActivity.mTwoPane = false;
    }
}