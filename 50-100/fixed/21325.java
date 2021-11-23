public boolean undoPendingDismiss() {
    boolean existPendingDismisses = existPendingDismisses();
    if (existPendingDismisses) {
        mPendingDismiss.rowContainer.undoContainer.setVisibility(View.GONE);
        mPendingDismiss.rowContainer.dataContainer.animate().translationX(0).setDuration(mAnimationTime).setListener(null);
        mPendingDismiss = null;
    }
    return existPendingDismisses;
}