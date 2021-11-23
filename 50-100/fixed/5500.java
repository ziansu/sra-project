@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.google.firebase.database.DatabaseReference mDatabaseRef = mDatabase.getReference("events").child(eventId).child("participantIds").push();
    mDatabaseRef.setValue(fireUser.getUid());
    onBackPressed();
}