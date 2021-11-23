public boolean isOpen(int x, int y) {
    validate(x, y);
    return isOpen[(--x)][(--y)];
}