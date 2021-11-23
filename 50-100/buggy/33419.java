public void getNumberOfUsers() {
    android.os.Bundle bundle = getIntent().getExtras();
    at.sw2017.q_up.PlaceDetails.place_id = bundle.getString("id");
    at.sw2017.q_up.DatabaseHandler db_handle = at.sw2017.q_up.QUpApp.getInstance().getDBHandler();
    peopleinQ = "Peope in queue:" + (java.lang.Integer.toString(db_handle.getQueuedUserCountFromPlace(at.sw2017.q_up.PlaceDetails.place_id)));
    peopleInQueue.setText(peopleinQ);
}