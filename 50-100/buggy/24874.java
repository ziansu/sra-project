private void menuItemAnim(int pos) {
    for (int i = 0; i < (getChildCount()); i++) {
        android.view.View childView = getChildAt((i + 1));
        if (i == pos) {
            childView.startAnimation(scaleBigAnim(300));
        }else {
            childView.startAnimation(scaleSmallAnim(300));
        }
        childView.setClickable(false);
        childView.setFocusable(false);
    }
}