public int createEvent(com.gameofthread.gather.integration.Event event) {
    com.google.firebase.database.DatabaseReference mDatabase = com.google.firebase.database.FirebaseDatabase.getInstance().getReference("events");
    java.lang.String userId = mDatabase.push().getKey();
    mDatabase.child(userId).push().setValue(event);
    return -1;
}