public boolean isActive() {
    if ((mContentView) != null) {
        return (mContentView.getLeft()) != 0;
    }
    return false;
}