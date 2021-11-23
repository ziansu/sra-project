@java.lang.Override
public void onBackPressed() {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("key", playingPos);
    setResult((-99), intent);
    super.onBackPressed();
    finish();
}