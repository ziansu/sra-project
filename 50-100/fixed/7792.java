public int getIndexDoc(final java.lang.String filePath) {
    for (int di = 0; di < (ndocs); di++) {
        if (docs[di].getDocLoc().getPath().contains(filePath))
            return di;
        
    }
    return -1;
}