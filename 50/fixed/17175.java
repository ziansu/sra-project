public void delete(java.lang.String id) {
    com.firebase.client.Firebase mRef = new com.firebase.client.Firebase(FIREBASE_URI).child(getObjectReference());
    mRef.child(id).removeValue();
}