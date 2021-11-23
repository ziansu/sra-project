@java.lang.Override
public void logout() {
    com.google.firebase.auth.FirebaseAuth.getInstance().signOut();
    profileView.onLogoutSuccess();
}