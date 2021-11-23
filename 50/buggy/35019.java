public int[] keysToArray() {
    if (0 == (this.size)) {
        return null;
    }
    int[] keysArr = new int[this.size];
    generateKeysArray(root, keysArr, 0);
    return keysArr;
}