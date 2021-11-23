@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    android.widget.RelativeLayout.LayoutParams params = ((android.widget.RelativeLayout.LayoutParams) (fab2.getLayoutParams()));
    params.setMargins(0, 0, RADII, RADII);
    fab2.setLayoutParams(params);
    fab2.clearAnimation();
}