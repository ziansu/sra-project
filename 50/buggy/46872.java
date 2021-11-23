@java.lang.Override
protected void onResume() {
    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    super.onResume();
}