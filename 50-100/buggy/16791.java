private boolean mouseOnClose() {
    if ((((mouse) != null) && ((mouse.getAbsoluteY()) == (getY()))) && ((mouse.getAbsoluteX()) == ((getX()) + 3))) {
        return true;
    }
    return false;
}