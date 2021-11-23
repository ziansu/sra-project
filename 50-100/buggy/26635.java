@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    android.support.design.widget.FloatingActionButton fab2 = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.item_p2)));
    android.widget.RelativeLayout.LayoutParams params = ((android.widget.RelativeLayout.LayoutParams) (fab2.getLayoutParams()));
    params.setMargins(0, 0, RADII, RADII);
    fab2.setLayoutParams(params);
    fab2.clearAnimation();
}