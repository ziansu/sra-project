private void showEmotionView(boolean showAnimation) {
    if (showAnimation) {
        transitioner.setDuration(200);
    }else {
        transitioner.setDuration(0);
    }
    int statusBarHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getStatusBarHeight();
    emotionHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getKeyboardHeight(this);
    android.util.Log.e("function_and_emotion1", java.lang.String.valueOf(function_and_emotion_parent.getHeight()));
    emojiconsLayout.getLayoutParams().height = emotionHeight;
    emojiconsLayout.setVisibility(View.VISIBLE);
    int lockHeight = unique.fancysherry.pigeons.util.system.ScreenUtils.getAppContentHeight(this);
    lockContainerHeight(lockHeight);
}