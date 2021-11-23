private void animateIn() {
    android.support.v7.widget.ActionMenuView menuView = getMenuView();
    for (int i = 0, count = menuView.getChildCount(); i < count; i++) {
        android.view.View child = menuView.getChildAt(i);
        android.view.animation.Animation anim = mAnimator.getInAnimation(child, i);
        if (anim != null)
            child.startAnimation(anim);
        
    }
}