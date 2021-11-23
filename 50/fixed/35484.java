private void loginSuccess(java.lang.String uid) {
    android.content.Intent intent = new android.content.Intent(this, com.freelancewatermelon.factordiary.SubUsersActivity.class);
    startActivity(intent);
    finish();
}