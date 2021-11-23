private void decrementIndices(int index) {
    for (int i = index; i < (objectCount); i++) {
        list[(i - 1)] = list[i];
    }
    list[size()] = null;
}