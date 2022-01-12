public void onBookmarkDelete(com.pindroid.providers.BookmarkContent.Bookmark b) {
    com.pindroid.action.BookmarkTaskArgs args = new com.pindroid.action.BookmarkTaskArgs(b, mAccount, this);
    new com.pindroid.action.DeleteBookmarkTask().execute(args);
    if ((findViewById(R.id.maincontent)) != null) {
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.remove(getSupportFragmentManager().findFragmentById(R.id.maincontent));
        transaction.commit();
    }
}