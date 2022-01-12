@java.lang.Override
public void removeCommentEntry(com.liferay.mobile.screens.models.CommentEntry commentEntry) {
    int position = getAdapter().getEntries().indexOf(commentEntry);
    getAdapter().getEntries().remove(commentEntry);
    int newRowCount = (getAdapter().getItemCount()) - 1;
    getAdapter().setRowCount(newRowCount);
    getAdapter().notifyItemRemoved(position);
    showEmptyListMessage();
}