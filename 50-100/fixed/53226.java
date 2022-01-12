public void onClick(android.view.View view) {
    java.lang.String groupReply = setTextEdit.getText().toString();
    android.util.Log.v("Group Reply:", groupReply);
    if (groupReply.matches("")) {
        groupReply = setTextEdit.getHint().toString();
    }
    setTextEdit.setText(null);
    db.setGroupResponse(groupName, groupReply);
}