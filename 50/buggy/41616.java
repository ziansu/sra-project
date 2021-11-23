public boolean performDrag(int dx, int dy) {
    if ((mDragListener) != null) {
        mDragListener.onDragStart(false);
    }
    return privatePerformDrag(false, dx, dy, true);
}