public void closeToLeft() {
    if (viewDragHelper.smoothSlideViewTo(dragView, (-(transformer.getOriginalWidth())), ((getHeight()) - (transformer.getMinHeightPlusMargin())))) {
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
        notifyCloseToLeftListener();
    }
}