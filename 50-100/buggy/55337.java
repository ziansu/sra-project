public T getDataSetByLabel(java.lang.String label, boolean ignorecase) {
    int index = getDataSetIndexByLabel(mDataSets, label, ignorecase);
    if ((index <= 0) || (index >= (mDataSets.size())))
        return null;
    else
        return mDataSets.get(index);
    
}