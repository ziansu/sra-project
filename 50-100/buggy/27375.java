@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.util.List<jp.hazuki.yuzubrowser.bookmark.BookmarkItem> selectedList = getSelectedBookmark(adapter.getSelectedItems());
    adapter.setMultiSelectMode(false);
    mCurrentFolder.list.removeAll(selectedList);
    mManager.write();
    adapter.notifyDataSetChanged();
}