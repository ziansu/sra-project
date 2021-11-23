@java.lang.Override
protected void onRestart() {
    super.onRestart();
    if (!(isLoggedIn()))
        startActivity(new android.content.Intent(getApplicationContext(), com.becker.nolan.mileagelog.LoginActivity.class));
    
    finish();
}