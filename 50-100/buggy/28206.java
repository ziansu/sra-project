@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.cse110.eventlit.db.Event event = dataSnapshot.getValue(com.cse110.eventlit.db.Event.class);
    if (event != null) {
        events.add(event);
        copy.add(event);
        eventWrappedTask.wrapResult(event);
    }else
        if (event == null) {
            com.cse110.utils.UserUtils.removeEventsFollowing(eventId);
        }
    
}