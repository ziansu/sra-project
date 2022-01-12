public void addLast(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    (mN)++;
    Deque<Item>.Node newLast = new Node();
    newLast.item = item;
    newLast.next = null;
    if ((mN) == 1) {
        newLast.prev = mLast;
    }else {
        newLast.prev = mLast;
        mLast.next = newLast;
        mLast = newLast;
    }
}