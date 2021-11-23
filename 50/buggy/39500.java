@java.lang.Override
public int size() {
    if ((com.nextfaze.poweradapters.data.SortData.getDataObserverCount()) <= 0) {
        return mData.size();
    }
    return mIndex.size();
}