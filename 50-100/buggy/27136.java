private void setupStatusBar() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        android.view.Window window = getWindow();
        android.widget.ImageView imageView = ((android.widget.ImageView) (findViewById(R.id.image)));
        android.support.design.widget.AppBarLayout appBarLayout = ((android.support.design.widget.AppBarLayout) (findViewById(R.id.app_bar)));
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, plus.mcpe.mcpe_plus.utils.UiExt.getStatusBarHeight()));
        window.getDecorView().setSystemUiVisibility(((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)));
    }
}