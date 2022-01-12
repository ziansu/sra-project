public void onClick(android.content.DialogInterface dialog, int id) {
    if ((mGoogleClient) != null) {
        Auth.GoogleSignInApi.signOut(mGoogleClient);
        com.example.jeobmallari.ilib.Home.super.onBackPressed();
    }else {
        com.example.jeobmallari.ilib.Home.super.onBackPressed();
    }
}