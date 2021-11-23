public void checkUserName() {
    if (((uid) == null) && ((auth) != null)) {
        com.google.firebase.auth.FirebaseUser user = auth.getCurrentUser();
        if (user != null) {
            this.uid = ((user.getDisplayName()) + "-") + (user.getUid());
        }
    }
}