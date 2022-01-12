private void logOut() {
    firebaseAuth.signOut();
    finish();
    android.widget.Toast.makeText(getApplicationContext(), "You logged out", Toast.LENGTH_SHORT).show();
    android.content.Intent signIn = new android.content.Intent(getApplicationContext(), com.gabrielemaffoni.toastapp.Login.class);
    startActivity(signIn);
}