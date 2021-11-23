public boolean isConsistent() {
    int cRow = (mMat.getRows()) - 1;
    while (((mPivots[cRow]) == (mMat.getColumns())) && (cRow >= 0)) {
        if (!(mMat.getCell(cRow, ((mMat.getColumns()) - 1)).equals(0)))
            return false;
        
        --cRow;
    } 
    return true;
}