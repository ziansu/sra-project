public void post(java.lang.String message) {
    final com.google.firebase.database.FirebaseDatabase database = com.google.firebase.database.FirebaseDatabase.getInstance();
    com.google.firebase.database.DatabaseReference ref = database.getReference("log");
    ref.child(java.util.UUID.randomUUID().toString()).setValue(new br.com.minone.webhooks.infrastructure.firebase.LogEntry(message));
}