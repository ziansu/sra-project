private void decrementIndices(int index) {
    for (int i = index; i < (size()); i++) {
        list[(i - 1)] = list[i];
    }
    list[size()] = null;
}