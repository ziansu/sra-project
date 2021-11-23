public com.google.firebase.database.Query getQuery(com.google.firebase.database.DatabaseReference databaseRef) {
    return databaseRef.child("saloons").orderByChild("msgNb");
}