private void setupStatusBar() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        android.widget.ImageView imageView = ((android.widget.ImageView) (findViewById(R.id.image)));
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, plus.mcpe.mcpe_plus.utils.UiExt.getStatusBarHeight()));
        getWindow().getDecorView().setSystemUiVisibility(((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)));
    }
}