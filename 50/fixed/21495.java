private void incrementIndices(int index) {
    for (int i = size(); i > index; i--) {
        list[i] = list[(i - 1)];
    }
}