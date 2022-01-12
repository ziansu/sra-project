@java.lang.Override
public void validateTopic(java.lang.String title, java.lang.String content, java.lang.String date) {
    boolean cancel = false;
    if (android.text.TextUtils.isEmpty(title)) {
        cancel = true;
        mAddTopicView.setTitleError(R.string.error_field_required);
    }
    if (android.text.TextUtils.isEmpty(content)) {
        mAddTopicView.setContentError(R.string.error_field_required);
        cancel = true;
    }
    if (!cancel) {
        if (isNewTopic()) {
            createTopic(title, content, date);
        }else {
            updateTopic(title, content);
        }
    }
}