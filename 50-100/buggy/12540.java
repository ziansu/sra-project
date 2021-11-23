public void onClick(android.content.DialogInterface dialog, int id) {
    dbHelper.unsubscribeFromLecture(lectureIdsToUnsubscribe);
    for (java.lang.String lectureId : lectureIdsToUnsubscribe) {
        com.pushbots.push.Pushbots.sharedInstance().untag("lectureId");
    }
    checkboxList = new java.util.ArrayList<>();
    myLecturesListView.setAdapter(new util.CustomListAdapter(this, R.layout.listitemrow, checkboxList));
    fillLecturesList();
    android.widget.Toast.makeText(this, "Subscribed", Toast.LENGTH_SHORT);
}