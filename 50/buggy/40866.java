@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.content.Intent intent = new android.content.Intent(this, com.example.ksusha.tetris.GameOver.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    this.finish();
    startActivity(intent);
}