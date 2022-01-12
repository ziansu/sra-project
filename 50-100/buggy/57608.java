public dataStructures.Type peek() {
    for (int x = (arr.length) - 1; x > 0; x--) {
        if ((arr[x]) != null) {
            return arr[x];
        }
    }
    return null;
}