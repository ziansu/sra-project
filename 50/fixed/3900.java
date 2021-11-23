private void startMainActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.teamagam.gimelgimel.app.mainActivity.view.MainActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(intent);
    this.finish();
}