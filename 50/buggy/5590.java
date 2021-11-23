private void registerEmailPw(android.view.View view) {
    android.content.Intent regEmail = new android.content.Intent(this, com.example.friends.fitfriend.RegisterWithEmailAndPwActivity.class);
    startActivity(regEmail);
    this.finish();
}