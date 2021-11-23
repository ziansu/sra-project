public void login(java.lang.String email, java.lang.String pw) {
    findViewById(R.id.login_progress).setVisibility(View.VISIBLE);
    new onl.deepspace.wgs.LoginActivity.GetUserData(this).execute(email, pw);
}