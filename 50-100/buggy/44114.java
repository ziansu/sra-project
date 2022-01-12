public void OnLogoFragmentCreateView(com.example.installed.practics1.LogoFragment logoFragment) {
    android.widget.FrameLayout.LayoutParams params = new android.widget.FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
    params.gravity = android.view.Gravity.CENTER;
    logoFragment.frameLayout.setLayoutParams(params);
    if ((metadata) != null) {
    }
    if ((onLoadingScreenControllerViewCreated) != null) {
        onLoadingScreenControllerViewCreated.OnLoadingScreenControllerViewCreated(this);
    }
}