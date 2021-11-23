private void restartActivity() {
    android.content.Intent intent = getIntent();
    finish();
    startActivity(intent);
}