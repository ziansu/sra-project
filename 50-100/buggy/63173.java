public void addNewRows(java.util.List pObjectList) {
    if ((this.mObjectList) == null) {
        this.mObjectList = pObjectList;
    }else {
        mObjectList.addAll(pObjectList);
    }
    if (mIsFilterEnabled) {
        mOriginalObjectList = mObjectList;
    }
    notifyDataSetChanged();
}