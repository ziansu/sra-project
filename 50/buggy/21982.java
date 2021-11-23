public int getAncestorPaddingTop() {
    return ((mParent) != null ? mParent.getPaddingTop() : 0) + (mPaddingTop);
}