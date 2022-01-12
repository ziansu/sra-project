private static void enableAutoHide(android.view.View view) {
    android.support.design.widget.AppBarLayout.LayoutParams params = ((android.support.design.widget.AppBarLayout.LayoutParams) (view.getLayoutParams()));
    params.setScrollFlags((((AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL) | (AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS)) | (AppBarLayout.LayoutParams.SCROLL_FLAG_SNAP)));
    view.setLayoutParams(params);
}