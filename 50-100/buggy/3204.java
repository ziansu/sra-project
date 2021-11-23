public static void saveToFirebase(com.firebase.geofire.GeoFire geoFire, com.firebase.client.Firebase db, nwhacks.tutorme.model.Tutor tutor, android.location.Location location) {
    com.firebase.client.Firebase tutorStore = db.child("tutors").child(tutor.getFullName());
    tutorStore.setValue(tutor);
    geoFire.setLocation(tutor.getFullName(), new com.firebase.geofire.GeoLocation(location.getLatitude(), location.getLongitude()));
}