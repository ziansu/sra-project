protected void hideNavigationBar() {
    if (this.isEnabledNavigationBarHiding()) {
        this.getWindow().getDecorView().setSystemUiVisibility(((((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)));
    }
}