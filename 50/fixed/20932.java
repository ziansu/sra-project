private java.lang.Integer addVals(java.lang.Integer set, java.lang.Integer get, int c) {
    if (set != null) {
        get += set;
        (count[c])++;
    }
    return get;
}