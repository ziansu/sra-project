public int getAncestorVerticalMargin() {
    return (mParent) != null ? (mParent.getAncestorVerticalMargin()) + (mParent.getVerticalMargin()) : 0;
}