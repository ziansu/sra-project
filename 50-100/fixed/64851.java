boolean isSelected(int x, int y) {
    for (int i = (shapes.size()) - 1; i >= 0; i--) {
        if (shapes.get(i).isInside(x, y)) {
            return true;
        }
    }
    return false;
}