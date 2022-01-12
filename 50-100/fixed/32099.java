@butterknife.OnClick(value = R.id.comments_send_image_button)
public void onSendComment() {
    java.lang.String commentText = vCommentInput.getText().toString();
    if (android.text.TextUtils.isEmpty(commentText.trim())) {
        android.widget.Toast.makeText(this, "Cannot send empty comments", Toast.LENGTH_LONG).show();
        return ;
    }
    com.babushka.slav_squad.persistence.database.model.User author = com.babushka.slav_squad.session.SessionManager.getInstance().getCurrentUser();
    com.babushka.slav_squad.persistence.database.model.Comment comment = new com.babushka.slav_squad.persistence.database.model.Comment(author, commentText);
    updateUIAfterCommentSent();
    mPresenter.addComment(comment);
}