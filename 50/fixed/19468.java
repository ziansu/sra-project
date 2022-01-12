public com.ludoscity.findmybikes.StationItem getSelected() {
    com.ludoscity.findmybikes.StationItem toReturn = null;
    if (((mSelectedPos) != (android.support.v7.widget.RecyclerView.NO_POSITION)) && ((mSelectedPos) < (mStationList.size())))
        toReturn = mStationList.get(mSelectedPos);
    
    return toReturn;
}