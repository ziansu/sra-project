@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        android.view.View decorView = this.getWindow().getDecorView();
        decorView.setSystemUiVisibility(((android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)));
    }
    setContentView(R.layout.activity_main);
}