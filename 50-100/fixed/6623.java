public boolean removeDataSet(T d) {
    if (d == null)
        return false;
    
    boolean removed = mDataSets.remove(d);
    if (removed) {
        mYValCount -= d.getEntryCount();
        mYValueSum -= d.getYValueSum();
        calcMinMax();
    }
    return removed;
}