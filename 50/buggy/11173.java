private void startMainActivity() {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.company.integer.vkmusic.MainActivity.class);
    com.company.integer.vkmusic.supportclasses.AppState.setTab(launchingIntent.getIntExtra("tab", 1));
    startActivity(intent);
    finish();
}