public void setInitialIndex(int index) {
    if ((index < 0) || (index > (rangeCount))) {
        throw new java.lang.IllegalArgumentException((((("Attempted to set index=" + index) + " out of range [0,") + (rangeCount)) + "]"));
    }
    currentIndex = index;
    currentSlidingX = selectedSlotX = slotPositions[currentIndex];
    invalidate();
}