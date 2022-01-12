public void SubmitLogin(android.view.View view) {
    startActivity(Login);
    myFirebaseRef.authWithPassword(Email.getText().toString(), Password.getText().toString(), new com.firebase.client.Firebase.AuthResultHandler() {
        @java.lang.Override
        public void onAuthenticated(com.firebase.client.AuthData authData) {
            fbla.hhs.eclat.DataStorage.setEmail(Email.toString());
            startActivity(Login);
        }

        @java.lang.Override
        public void onAuthenticationError(com.firebase.client.FirebaseError firebaseError) {
            android.widget.Toast.makeText(fbla.hhs.eclat.Login.this, firebaseError.getMessage(), Toast.LENGTH_SHORT).show();
        }
    });
}