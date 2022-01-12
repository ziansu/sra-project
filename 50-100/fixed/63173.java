public void addNewRows(java.util.List pObjectList) {
    if ((this.mObjectList) == null) {
        this.mObjectList = new java.util.ArrayList();
    }
    mObjectList.addAll(pObjectList);
    if (mIsFilterEnabled) {
        mOriginalObjectList = mObjectList;
    }
    notifyDataSetChanged();
}