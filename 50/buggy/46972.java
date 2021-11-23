@java.lang.Override
public void onResume() {
    if (this.application.getKioskModeEnabled()) {
        android.content.Intent intent = new android.content.Intent(this, org.fourdnest.androidclient.ui.NewEggActivity.class);
        this.startActivity(intent);
        finish();
    }
    super.onResume();
}