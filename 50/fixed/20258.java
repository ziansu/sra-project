public void moveToSelected() {
    float x = selectedRange.getX();
    float y = selectedRange.getY();
    clearRange();
    setDirection(x, y);
    setPosition(x, y);
}