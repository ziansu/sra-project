public uarray.UArray.Item[] toItemArray() {
    if ((length()) == 0) {
        uarray.UArray.Item[] ia = new uarray.UArray.Item[]{  };
        return ia;
    }
    uarray.UArray.Item[] ia = new uarray.UArray.Item[length()];
    int p = 0;
    for (uarray.UArray.Item i : items) {
        ia[p] = i;
        p++;
    }
    return ia;
}