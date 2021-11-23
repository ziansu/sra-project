public dataStructures.Type pop() {
    for (int x = (arr.length) - 1; x > (-1); x--) {
        if ((arr[x]) != null) {
            dataStructures.Type t = arr[x];
            arr[x] = null;
            return t;
        }
    }
    return null;
}