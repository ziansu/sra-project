private int root(int i) {
    while (i != (mId[i])) {
        root(mId[i]);
    } 
    return i;
}