public void add(java.lang.String s) {
    if ((array.length) == (size)) {
        java.lang.String[] temp = new java.lang.String[(array.length) * 2];
        for (int x = 0; x < (array.length); x++) {
            temp[x] = array[x];
        }
        array = temp;
    }
    array[((size) + 1)] = s;
    (size)++;
    pushUp();
}