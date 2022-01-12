private void pushUp() {
    int i = size;
    while ((i != 1) && (((array[i].compareTo(array[(i / 2)])) * (direction)) > 0)) {
        java.lang.Integer swap = array[(i / 2)];
        array[(i / 2)] = array[i];
        array[i] = swap;
        i /= 2;
    } 
}