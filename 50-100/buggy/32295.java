@java.lang.Override
public void onHide(android.os.Parcelable parcelable) {
    if (!(isAdded()))
        return ;
    
    org.wordpress.android.ui.comments.CommentActions.moderateCommentForNote(note, newStatus, new org.wordpress.android.ui.comments.CommentActions.CommentActionListener() {
        @java.lang.Override
        public void onActionResult(boolean succeeded) {
            if (!(isAdded()))
                return ;
            
            if (!succeeded) {
                setNoteIsHidden(note.getId(), false);
                org.wordpress.android.util.ToastUtils.showToast(getActivity(), R.string.error_moderate_comment, ToastUtils.Duration.LONG);
            }
        }
    });
}