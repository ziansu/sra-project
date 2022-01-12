private void changeToLandscape() {
    mTopView.setVisibility(View.GONE);
    mBottomView.setVisibility(View.GONE);
    int uiFlags = ((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN);
    uiFlags |= 4096;
    getWindow().getDecorView().setSystemUiVisibility(uiFlags);
}