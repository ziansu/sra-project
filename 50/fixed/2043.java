private com.google.firebase.database.DatabaseReference getDealsReference(java.lang.String email) {
    java.lang.String key = email.replace('.', '_');
    return dataReference.getRoot().child(luque.david.payme.domain.FirebaseHelper.DEALS_PATH).child(key);
}