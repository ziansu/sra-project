private void heapify() {
    for (int index = ((this.size) / 2) - 1; index >= 0; --index) {
        percolateDn(index);
    }
}