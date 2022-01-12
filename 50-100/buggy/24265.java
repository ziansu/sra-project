private void growArray() {
    java.lang.Object[] temp = new java.lang.Object[(top) * 2];
    for (int i = 0; i < (items.length); i++) {
        temp[i] = items[i];
    }
    items = temp;
}