public static int positionInSet(java.lang.Integer[] set, java.lang.Integer id) {
    int index = 0;
    for (int i : set) {
        if (i == id) {
            return index;
        }
        index++;
    }
    return -1;
}