public void clearList() {
    if (((mResultList) != null) && ((mResultList.size()) > 0)) {
        mResultList.clear();
    }
    notifyDataSetChanged();
}