private void saveNewUser(java.lang.String userId, java.lang.String name, java.lang.String email, java.lang.String image) {
    com.sarahrobinson.finalyearproject.classes.User user = new com.sarahrobinson.finalyearproject.classes.User(userId, name, email, image);
    firebaseRef.child("users").child(userId).setValue(user);
}