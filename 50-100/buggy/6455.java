public static void saveUserOnline() {
    if (com.achanr.glovercolorapp.common.GCAuthUtil.isCurrentUserLoggedIn()) {
        com.google.firebase.auth.FirebaseUser currentUser = com.achanr.glovercolorapp.common.GCAuthUtil.getCurrentUser();
        com.achanr.glovercolorapp.models.GCUser user = com.achanr.glovercolorapp.models.GCUser.convertFromFirebaseUser(currentUser);
        com.achanr.glovercolorapp.common.GCOnlineDatabaseUtil.getCurrentDatabaseReference().child(com.achanr.glovercolorapp.common.GCOnlineDatabaseUtil.USERS_KEY).child(currentUser.getUid()).setValue(user);
    }
}