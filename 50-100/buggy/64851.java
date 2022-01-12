boolean isSelected(int x, int y) {
    for (int i = (shapes.size()) - 1; i >= 0; i--) {
        if (shapes.get(i).isInside(x, y)) {
            selected = i;
            isSelected = true;
            return true;
        }
    }
    return false;
}