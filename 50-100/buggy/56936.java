private boolean checkAndHandleEmptyTitle() {
    android.widget.EditText topicEditText = ((android.widget.EditText) (getActivity().findViewById(R.id.discussion_edt_question)));
    java.lang.String topic = topicEditText.getText().toString();
    boolean isEmpty = false;
    if (topic.equals("")) {
        new android.app.AlertDialog.Builder(getActivity()).setTitle(R.string.dialog_topic_title).setMessage(R.string.dialog_topic_message).setPositiveButton(R.string.ok, null).create().show();
        isEmpty = true;
    }
    return isEmpty;
}