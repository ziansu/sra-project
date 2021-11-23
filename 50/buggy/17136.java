private void moveToSignUpActivity() {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.example.ahmedsaleh.dbse.SignUp.class);
    startActivity(i);
    setContentView(R.layout.activity_sign_up);
}