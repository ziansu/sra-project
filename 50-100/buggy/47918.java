private void hideSystemUI() {
    android.util.Log.d("BackEnd", "On method hideSystemUI ");
    mDecorView.setSystemUiVisibility((((((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_LOW_PROFILE)) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE)));
}