private void pushUp() {
    int i = size;
    while ((i != 1) && (((array[i].compareTo(array[(i / 2)])) * (direction)) > 0)) {
        int p = i / 2;
        java.lang.Integer swap = array[p];
        array[p] = array[i];
        array[i] = swap;
        i = p;
    } 
}