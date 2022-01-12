private void addBookmark(org.brandroid.openmanager.data.OpenBookmarks.BookmarkType type, org.brandroid.openmanager.data.OpenPath path) {
    int iType = getTypeInteger(type);
    java.util.ArrayList<org.brandroid.openmanager.data.OpenPath> paths = new java.util.ArrayList<org.brandroid.openmanager.data.OpenPath>();
    if (mBookmarksArray.containsKey(iType))
        paths = mBookmarksArray.get(iType);
    
    paths.add(path);
    mBookmarksArray.put(iType, paths);
    mBookmarkAdapter.notifyDataSetChanged();
}