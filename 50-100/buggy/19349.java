private void saveNewUser(java.lang.String userId, java.lang.String name, java.lang.String email, java.lang.String image, java.util.List<java.lang.String> favouritePlaces) {
    com.sarahrobinson.finalyearproject.classes.User user = new com.sarahrobinson.finalyearproject.classes.User(userId, name, email, image, favouritePlaces);
    firebaseRef.child("users").child(userId).setValue(user);
}