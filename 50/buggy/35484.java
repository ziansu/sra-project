private void loginSuccess(java.lang.String uid) {
    android.content.Intent intent = new android.content.Intent(this, com.freelancewatermelon.factordiary.SubUsersActivity.class);
    intent.putExtra("uid", uid);
    startActivity(intent);
    finish();
}