public int[] keysToArray() {
    int[] keysArr = new int[this.size];
    if (0 == (this.size)) {
        return keysArr;
    }
    generateKeysArray(root, keysArr, 0);
    return keysArr;
}