public void addNewRows(java.lang.Object pObject) {
    if ((this.mObjectList) == null) {
        this.mObjectList = new java.util.ArrayList();
    }else {
        mObjectList.add(pObject);
    }
    if (mIsFilterEnabled) {
        mOriginalObjectList = mObjectList;
    }
    notifyDataSetChanged();
}