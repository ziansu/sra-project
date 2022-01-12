public com.google.firebase.database.DatabaseReference getUserReference(java.lang.String email) {
    com.google.firebase.database.DatabaseReference userReference = null;
    if (email != null) {
        java.lang.String emailKey = email.replace(".", "_");
        userReference = dataReference.getRoot().child(luque.david.payme.domain.FirebaseHelper.USERS_PATH).child(emailKey);
    }
    return userReference;
}