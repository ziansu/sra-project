private int select(java.lang.String[] s) {
    int i;
    for (java.lang.String subs : s) {
        i = 0;
        for (java.lang.String op : Decoder.options) {
            if (Decoder.equiv(subs, op)) {
                return i;
            }
            i++;
        }
    }
    return -1;
}