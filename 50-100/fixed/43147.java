public int idx_64(java.util.List<java.lang.Double> kbArr) {
    int idx = 0;
    for (int i = 0; i < (kbArr.size()); i++) {
        if ((kbArr.get(i)) < 64) {
            idx = i;
            return idx;
        }
    }
    return (kbArr.size()) - 1;
}