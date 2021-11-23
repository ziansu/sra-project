public int getAncestorPaddingTop() {
    return ((mParent) != null ? mParent.getAncestorPaddingTop() : 0) + (mPaddingTop);
}