private void showEmotionView(boolean showAnimation) {
    if (showAnimation) {
        transitioner.setDuration(200);
    }else {
        transitioner.setDuration(0);
    }
    int statusBarHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getStatusBarHeight();
    emotionHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getKeyboardHeight(this);
    emojiconsLayout.getLayoutParams().height = emotionHeight;
    emojiconsLayout.setVisibility(View.VISIBLE);
    int lockHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getAppContentHeight(this);
    lockContainerHeight(lockHeight);
}