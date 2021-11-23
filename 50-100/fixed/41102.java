private void logOut() {
    firebaseAuth.signOut();
    android.content.Intent signIn = new android.content.Intent(getApplicationContext(), com.gabrielemaffoni.toastapp.Login.class);
    startActivity(signIn);
    finish();
    android.widget.Toast.makeText(getApplicationContext(), "You logged out", Toast.LENGTH_SHORT).show();
}