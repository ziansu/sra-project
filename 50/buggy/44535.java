@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    mMeetings.add(dataSnapshot.getValue(com.epicodus.anonrec.models.Meeting.class));
}