public void onBookmarkAdd(com.pindroid.providers.BookmarkContent.Bookmark b) {
    if (b != null) {
        startActivity(com.pindroid.action.IntentHelper.AddBookmark(b.getUrl(), mAccount.name, this));
    }
}