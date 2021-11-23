protected void onActionBarAutoShowOrHide(boolean shown) {
    updateSwipeRefreshProgressBarTop();
    for (android.view.View view : mHideableHeaderViews) {
        if (shown) {
            view.animate().translationY(0).setDuration(com.nadmm.airports.ActivityBase.HEADER_HIDE_ANIM_DURATION).setInterpolator(new android.view.animation.DecelerateInterpolator());
        }else {
            int offset = ((int) (view.getTag(R.id.AUTOHIDE_OFFSET)));
            view.animate().translationY((-offset)).setDuration(com.nadmm.airports.ActivityBase.HEADER_HIDE_ANIM_DURATION).setInterpolator(new android.view.animation.DecelerateInterpolator());
        }
    }
}