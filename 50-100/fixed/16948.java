private void writeNewUser(java.lang.String userId, java.lang.String name, java.lang.String email) {
    com.doufa.sekritoo.posts.models.User user = new com.doufa.sekritoo.posts.models.User(name, email);
    user.lastVisit = java.lang.System.currentTimeMillis();
    mDatabase.child("users").child(userId).setValue(user);
}