public void removeAllChildUI() {
    if ((mChildUIMap.size()) > 0) {
        java.util.Collection<com.android.pigknight.UI> children = mChildUIMap.values();
        for (com.android.pigknight.UI child : children) {
            if ((child != null) && (child instanceof com.android.pigknight.UI)) {
                child.dispatchRelease();
            }
        }
    }
    if ((mChildUIViewAnimator) != null)
        mChildUIViewAnimator.removeAllViews();
    
    mCurChildKey = null;
}