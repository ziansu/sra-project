@butterknife.OnClick(value = R.id.btn_sign_in_offline)
public void onSignInOffline() {
    android.content.Intent startAppInOffline = new android.content.Intent(getApplicationContext(), com.bytebuilding.affairmanager.activities.MainOfflineActivity.class);
    startActivity(startAppInOffline);
    finish();
}