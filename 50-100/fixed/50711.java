public boolean removeEntry(com.github.mikephil.charting.data.Entry e, int dataSetIndex) {
    if ((e == null) || (dataSetIndex >= (mDataSets.size())))
        return false;
    
    boolean removed = mDataSets.get(dataSetIndex).removeEntry(e.getXIndex());
    if (removed) {
        float val = e.getVal();
        mYValCount -= 1;
        mYValueSum -= val;
        calcMinMax();
    }
    return removed;
}