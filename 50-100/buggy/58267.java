private void moveElements(final int index) {
    for (int i = (size()) - 1; i >= index; --i) {
        E moveElement = this.get(i);
        putIn(moveElement, (index + 1));
    }
}