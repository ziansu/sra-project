int einfuegePosition(java.lang.Integer key, java.lang.Integer[] ls) {
    for (int i = 0; i < (ls.length); i++) {
        if ((ls[i]) == null) {
            return i;
        }else
            if (key < (ls[i])) {
                return i;
            }else {
            }
        
    }
    return 0;
}