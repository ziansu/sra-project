private void removeTopCard() {
    android.view.View child = getChildAt(((getChildCount()) - 1));
    if (child != null) {
        child.setOnTouchListener(null);
        child.setX(0);
        child.setY(0);
        child.setRotation(0);
        removeView(child);
        lastRemovedView = child;
    }
    if (((getChildCount()) <= 0) && ((eventCallback) != null)) {
        eventCallback.cardsDepleted();
    }
}