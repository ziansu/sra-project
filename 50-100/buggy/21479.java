public void showSuggestions() {
    if (((mFlexboxLayout.getChildCount()) > 0) && ((mFlexboxLayout.getVisibility()) == (android.view.View.GONE))) {
        mViewDivider.setVisibility(View.VISIBLE);
        mFlexboxLayout.setVisibility(View.VISIBLE);
    }
    if (((mRecyclerViewAdapter) != null) && ((mRecyclerViewAdapter.getItemCount()) > 0)) {
        mViewDivider.setVisibility(View.VISIBLE);
        mRecyclerView.setVisibility(View.VISIBLE);
        com.lapism.searchview.SearchAnimator.fadeIn(mRecyclerView, mAnimationDuration);
    }
}