public boolean performDrag(int dx, int dy) {
    mDragListener.onDragStart(false);
    return privatePerformDrag(false, dx, dy, true);
}