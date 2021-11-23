public int numberOfOpenSites() {
    int count = 0;
    for (int i = 0; i < (arr.length); i++) {
        if ((arr[i]) != i) {
            count++;
        }
    }
    return count;
}