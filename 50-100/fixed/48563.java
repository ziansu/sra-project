public java.lang.Long toBinary() {
    long binary = 0;
    for (int i = 0; i < (pieces.length); i++) {
        for (int j = 0; j < (pieces[i].length); j++) {
            binary <<= 3;
            binary |= pieces[i][j].getId();
        }
    }
    return binary;
}