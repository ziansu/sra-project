public void endDrag() {
    mode = com.panxiaohe.springboard.library.SpringboardView.MODE.FREE;
    if ((temChangPosition) != (-1)) {
        getChildAt(temChangPosition).setVisibility(View.VISIBLE);
    }
    getParent().requestDisallowInterceptTouchEvent(false);
    dragPosition = temChangPosition = -1;
    com.panxiaohe.springboard.library.FingerFlowViewManager.getInstance().remove();
}