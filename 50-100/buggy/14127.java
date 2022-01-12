private void initBar() {
    int uiFlags = android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        if (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) && (!(com.gyf.barlibrary.OSUtils.isEMUI3_1()))) {
            uiFlags = initBarAboveLOLLIPOP(uiFlags);
            fitsSystemWindows();
        }else {
            initBarBelowLOLLIPOP();
            solveNavigation();
        }
        uiFlags = setStatusBarDarkFont(uiFlags);
    }
    uiFlags = hideBar(uiFlags);
    mWindow.getDecorView().setSystemUiVisibility(uiFlags);
}