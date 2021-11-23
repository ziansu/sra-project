@org.greenrobot.eventbus.Subscribe
protected void onUpdateRecyclerViewPositionEvent(com.essentialtcg.magicthemanaging.events.UpdateRecyclerViewPositionReturnEvent event) {
    mRecyclerView.scrollToPosition(event.currentPosition);
    mInitialPosition = event.initialPosition;
    mCurrentPosition = event.currentPosition;
    mReturning = true;
    mRecyclerView.invalidate();
    mRecyclerView.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {
        @java.lang.Override
        public boolean onPreDraw() {
            mRecyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
            mRecyclerView.requestLayout();
            if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
                getActivity().startPostponedEnterTransition();
            }
            return true;
        }
    });
}