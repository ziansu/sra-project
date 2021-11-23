public int getIndexDoc(final java.lang.String fileName) {
    for (int di = 0; di < (ndocs); di++) {
        if (docs[di].getDocLoc().getPath().contains(fileName))
            return di;
        
    }
    return -1;
}