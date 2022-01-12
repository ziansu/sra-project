@java.lang.Override
public void removeCommentEntry(com.liferay.mobile.screens.models.CommentEntry commentEntry) {
    int position = getAdapter().getEntries().indexOf(commentEntry);
    getAdapter().getEntries().remove(commentEntry);
    getAdapter().setRowCount(getAdapter().getEntries().size());
    getAdapter().notifyItemRemoved(position);
    showEmptyListMessage();
}