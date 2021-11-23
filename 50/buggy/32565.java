private void showSystemUI() {
    android.util.Log.d("BackEnd", "On method showSystemUI ");
    mDecorView.setSystemUiVisibility((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)));
}