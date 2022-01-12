private void writeNewUser(java.lang.String userId, java.lang.String name, java.lang.String email, java.lang.String sexe) {
    com.doufa.sekritoo.posts.models.User user = new com.doufa.sekritoo.posts.models.User(name, email, sexe);
    user.lastVisit = java.lang.System.currentTimeMillis();
    mDatabase.child("users").child(userId).setValue(user);
}