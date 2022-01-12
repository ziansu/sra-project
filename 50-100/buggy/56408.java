public uarray.UArray.Item[] toItemArray() {
    uarray.UArray.Item[] ia = new uarray.UArray.Item[(this.length()) - 1];
    int p = 0;
    for (uarray.UArray.Item i : items) {
        ia[p] = i;
        p++;
    }
    return ia;
}