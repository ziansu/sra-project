private int findRangeContaining(long index) {
    for (int i = 0; i < (indexes.length); i++) {
        if ((indexes[i]) > index) {
            return i - 1;
        }else
            if ((indexes[i]) == index) {
                return i;
            }
        
    }
    return index > (indexes[((indexes.length) - 1)]) ? (indexes.length) - 1 : -1;
}