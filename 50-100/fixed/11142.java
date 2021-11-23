private void saveUserInformation() {
    java.lang.String name = editTextName.getText().toString();
    java.lang.String add = editTextAddress.getText().toString();
    fluffystudios.firebaseauthdemo.UserInformation userInformation = new fluffystudios.firebaseauthdemo.UserInformation(name, add);
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    databaseReference.child(user.getUid()).setValue(userInformation);
    android.widget.Toast.makeText(this, "Information Saved...", Toast.LENGTH_SHORT).show();
}