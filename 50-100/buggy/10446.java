private boolean mouseOnMaximize() {
    if (((((mouse) != null) && (!(isModal()))) && ((mouse.getAbsoluteY()) == (getY()))) && ((mouse.getAbsoluteX()) == (((getX()) + (getWidth())) - 4))) {
        return true;
    }
    return false;
}