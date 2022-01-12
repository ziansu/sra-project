@java.lang.Override
public void run() {
    initGridBackgrounds();
    for (int i = 0; i < (arrTextViewsEnemy.length); i++) {
        android.view.animation.Animation fadeIn = new android.view.animation.AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new android.view.animation.DecelerateInterpolator());
        fadeIn.setDuration(100);
        fadeIn.setStartOffset((i * 100));
        arrShipsPlayer[i].startAnimation(fadeIn);
        arrShipsPlayer[i].setAlpha(1.0F);
    }
}