public void setData(java.lang.Integer number) {
    if ((android.text.TextUtils.equals(((mNumber) + ""), (number + ""))) || ((mNumber) == 0)) {
        integerLinkedList.add(number);
    }
    mNumber = number;
    if ((mAdapter.isFree()) && (adapterIsFree)) {
        if ((integerLinkedList.size()) > 0) {
            mAdapter.setData(integerLinkedList.get(0));
        }
        adapterIsFree = false;
    }
}