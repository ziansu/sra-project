@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    isLock = false;
    list.remove(position);
    animationGridViewAdapter.removeItem(0).removeItem(0).commit();
}