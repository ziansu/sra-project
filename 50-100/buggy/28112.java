int einfuegePosition(java.lang.Integer key, java.lang.Integer[] ls) {
    int i = 0;
    while (i < (ls.length)) {
        if ((ls[i]) == null) {
            return i;
        }
        if (key < (ls[i])) {
            return i;
        }else {
            i++;
        }
    } 
    return i;
}