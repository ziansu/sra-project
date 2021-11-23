private void showFunctionView(boolean showAnimation) {
    if (showAnimation) {
        transitioner.setDuration(200);
    }else {
        transitioner.setDuration(0);
    }
    int statusBarHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getStatusBarHeight();
    emotionHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getKeyboardHeight(this);
    unique.fancysherry.pigeons.util.system.KeyBoardUtils.hideSoftInput(chat_text);
    function_layout.getLayoutParams().height = emotionHeight;
    function_layout.setVisibility(View.VISIBLE);
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    int lockHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getAppContentHeight(this);
    lockContainerHeight(lockHeight);
}