public void onBookmarkMark(com.pindroid.providers.BookmarkContent.Bookmark b) {
    if (((b != null) && (isMyself())) && (b.getToRead())) {
        com.pindroid.action.BookmarkTaskArgs unreadArgs = new com.pindroid.action.BookmarkTaskArgs(b, mAccount, this);
        new com.pindroid.action.MarkReadBookmarkTask().execute(unreadArgs);
    }
}