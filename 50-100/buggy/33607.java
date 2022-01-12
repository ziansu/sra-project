private void stopRefreshAnimationAndHideView() {
    isRefreshing = false;
    if ((refreshAnimation) != null)
        refreshAnimation.stop();
    
    if (((refreshView) != null) && ((pullState) != 0)) {
        pullState = 0;
        pullIconView.setImageDrawable(startDrawable);
        hideRefreshView(maxRefreshViewHeight);
    }
}