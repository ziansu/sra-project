private void recoverChildView() {
    final int childCount = getChildCount();
    for (int i = 0; i < childCount; i++) {
        getChildAt(i).animate().translationX(1).translationY(1).scaleX(1).scaleX(1).start();
    }
    requestLayout();
}