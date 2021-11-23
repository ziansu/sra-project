protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.google.firebase.database.FirebaseDatabase firebaseDatabase = com.google.firebase.database.FirebaseDatabase.getInstance();
    firebaseDatabase.setPersistenceEnabled(true);
    checkIfAlreadyhavePermission();
    android.content.Intent intent = new android.content.Intent(this, com.udit.android.notes.MainActivity.class);
    startActivity(intent);
    this.finish();
}