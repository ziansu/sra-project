public void setData(java.lang.Integer number) {
    integerLinkedList.add(number);
    if ((mAdapter.isFree()) && (adapterIsFree)) {
        if ((integerLinkedList.size()) > 0) {
            mAdapter.setData(integerLinkedList.get(0));
        }
        adapterIsFree = false;
    }
}