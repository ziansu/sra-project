public void closeToRight() {
    if (viewDragHelper.smoothSlideViewTo(dragView, ((int) (transformer.getOriginalWidth())), ((getHeight()) - (transformer.getMinHeightPlusMargin())))) {
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
        notifyCloseToRightListener();
    }
}