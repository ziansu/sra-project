public void onClick(android.content.DialogInterface dialog, int id) {
    fragment.topic.tDatabaseReference.child(ui.TopicActivity.topicId).removeValue();
    android.content.Intent i = new android.content.Intent(ui.TopicActivity.AlertFragment.context, ui.TopicActivity.AlertFragment.okClass);
    startActivity(i);
}