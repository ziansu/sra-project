public void clearArchives(android.view.View view) {
    MainActivity.mArchives.edit().clear().apply();
    mArchiveLayout.removeAllViews();
}