public boolean isConsistent() {
    int cRow = (mMat.getRows()) - 1;
    while (((mPivots[cRow]) == (mMat.getColumns())) && (cRow > 0))
        --cRow;
    
    return (mPivots[cRow]) != ((mMat.getColumns()) - 1);
}