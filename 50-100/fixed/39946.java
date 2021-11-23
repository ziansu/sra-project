@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.cse110.eventlit.db.Event event = dataSnapshot.getValue(com.cse110.eventlit.db.Event.class);
    android.util.Log.d("in eventutils rsvp is ", ("" + rsvp));
    android.util.Log.d("in eventutils event is ", ("" + event));
    if (event != null)
        eventsFollowing.add(dataSnapshot.getValue(com.cse110.eventlit.db.Event.class));
    
    android.util.Log.w("countdown", ("" + (signal.getCount())));
    signal.countDown();
}