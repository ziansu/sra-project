@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    android.widget.RelativeLayout.LayoutParams params = ((android.widget.RelativeLayout.LayoutParams) (fab1.getLayoutParams()));
    params.setMargins(0, 0, 0, RADIUS);
    fab1.setLayoutParams(params);
    fab1.clearAnimation();
}