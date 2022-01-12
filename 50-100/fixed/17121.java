private void showFunctionView(boolean showAnimation) {
    if (showAnimation) {
        transitioner.setDuration(200);
    }else {
        transitioner.setDuration(0);
    }
    int statusBarHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getStatusBarHeight();
    emotionHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getKeyboardHeight(this);
    function_layout.getLayoutParams().height = emotionHeight;
    function_layout.setVisibility(View.VISIBLE);
    int lockHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getAppContentHeight(this);
    lockContainerHeight(lockHeight);
}