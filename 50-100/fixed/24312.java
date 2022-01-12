private void removeIndexRange(final int innerPositionStart, final int itemCount) {
    for (int innerPosition = (innerPositionStart + itemCount) - 1; innerPosition >= innerPositionStart; innerPosition--) {
        int i = mIndex.binarySearch(innerPosition);
        if (i >= 0) {
            mIndex.remove(i);
            mIndex.shift(i, (-1));
            com.nextfaze.poweradapters.data.FilterData.notifyItemRemoved(i);
        }else {
            mIndex.shift((~i), (-1));
        }
    }
}