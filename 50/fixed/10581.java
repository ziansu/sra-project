private void confirmMenuPosition(int maxPos) {
    if ((menuPosition) < 0) {
        menuPosition = maxPos;
    }
    if ((menuPosition) > maxPos) {
        menuPosition = 0;
    }
}