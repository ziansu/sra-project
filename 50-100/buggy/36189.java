@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    mToolbar.setBackgroundColor(primaryColors[i]);
    getSupportActionBar().setTitle(titles[i]);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        getWindow().setStatusBarColor(primaryDarkColors[i]);
    }
    (i)++;
    layoutReveal.setBackgroundColor(Color.WHITE);
}