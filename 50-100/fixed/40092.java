private void setUpFullScreen() {
    isFullScreenShown = true;
    mStoryParentLayout.fullScroll(View.FOCUS_UP);
    attachPixtoryContent(AppConstants.SHOW_PIC_STORY);
    mImageDetailsLayout.setVisibility(View.VISIBLE);
    mTextExpert.setVisibility(View.VISIBLE);
    mCommentShareLayout.setVisibility(View.GONE);
    mImageDetailsLayout.smoothScrollTo(0, 0);
    if (!(isSwipeUpArrowShown)) {
        swipeUpArrow.setVisibility(View.VISIBLE);
        swipeUpArrow.setAnimation(com.pixtory.app.fragments.MainFragment.mAnimation);
        isSwipeUpArrowShown = true;
    }
}