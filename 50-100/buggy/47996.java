public void onBookmarkView(com.pindroid.providers.BookmarkContent.Bookmark b) {
    if (((findViewById(R.id.maincontent)) != null) || ((findViewById(R.id.tagcontent)) != null)) {
        setBookmarkView(b, BookmarkViewType.VIEW);
    }else {
        startActivity(com.pindroid.action.IntentHelper.ViewBookmark(b, username, this));
    }
}