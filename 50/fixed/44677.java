@java.lang.Override
public void onUndo(android.os.Parcelable parcelable) {
    org.wordpress.android.ui.reader.actions.ReaderBlogActions.undoBlockBlogFromReader(blockResult);
    refreshPosts(false);
}