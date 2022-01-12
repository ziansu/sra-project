@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.importBackup :
            loadFileList(null);
            onCreateDialog(acr.browser.lightning.BookmarkActivity.DIALOG_LOAD_FILE);
            break;
        case R.id.importFromBrowser :
            mBookmarkManager.importBookmarksFromBrowser(this);
            break;
        case R.id.exportBackup :
            mBookmarkManager.exportBookmarks();
            break;
    }
}