private void growArray() {
    java.lang.Object[] temp = new java.lang.Object[(items.length) * 2];
    for (int i = 0; i < (top); i++) {
        temp[i] = items[i];
    }
    items = temp;
}