public void setList(java.util.List pObjectList) {
    if ((this.mObjectList) == null) {
        this.mObjectList = pObjectList;
    }else {
        mObjectList.clear();
        mObjectList.addAll(pObjectList);
    }
    if (mIsFilterEnabled) {
        mOriginalObjectList = pObjectList;
    }
    notifyDataSetChanged();
}