public boolean removeTag(java.lang.Object tag) {
    boolean removed = this.removeComponentTag(this.contentPane, tag);
    if (removed) {
        this.processTouchMotionEvent();
    }
    return removed;
}