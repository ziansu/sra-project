private int root(int i) {
    while (i != (mId[i])) {
        i = mId[i];
    } 
    return i;
}