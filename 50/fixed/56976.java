public void navigateToMain() {
    android.content.Intent toMain = new android.content.Intent(this, org.secfirst.umbrella.MainActivity.class);
    toMain.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.support.v4.content.IntentCompat.FLAG_ACTIVITY_CLEAR_TASK)));
    startActivity(toMain);
}