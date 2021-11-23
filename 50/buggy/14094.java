public int removeName(java.lang.String name) {
    int removed = this.removeComponentName(this.contentPane, name);
    if (removed != (-1)) {
        this.processTouchMotionEvent();
    }
    return removed;
}