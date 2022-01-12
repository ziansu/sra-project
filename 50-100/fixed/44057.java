private void handleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInResult result) {
    android.util.Log.e("TAG", ("handleSignInResult:" + (result.isSuccess())));
    if (result.isSuccess()) {
        com.google.android.gms.auth.api.signin.GoogleSignInAccount acct = result.getSignInAccount();
        android.content.Intent intent = new android.content.Intent(this, com.example.xcomputers.placelocator.MainActivity.class);
        startActivity(intent);
        finish();
        hideProgressDialog();
    }else {
        hideProgressDialog();
    }
}