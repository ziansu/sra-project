@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.lang.String key = com.dhbw.project.spezl.view.EventActivity.getKeyByValue(event.getParticipantIds(), fireUser.getUid());
    if (key != null) {
        com.google.firebase.database.DatabaseReference mDatabaseRef = mDatabase.getReference("events").child(eventId).child("participantIds").child(key);
        mDatabaseRef.removeValue();
        onBackPressed();
    }
}