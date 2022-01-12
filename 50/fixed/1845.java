public void removeDriver() {
    com.firebase.client.Firebase driverRef = driversRef.child(mId);
    driverRef.removeValue();
    mId = null;
}