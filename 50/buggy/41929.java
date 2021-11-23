public boolean isActive() {
    if ((mContentView) != null) {
        if ((mContentView.getLeft()) != 0) {
            return true;
        }
    }
    return false;
}