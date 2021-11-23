private void delFunction() {
    for (int i : mIndex) {
        java.util.ArrayList<java.lang.Object> itemBean = mData.get(i);
        if (((int) (itemBean.get(POS_MARK))) == (MARK_DELETE)) {
            itemBean.set(POS_MARK, MARK_INVISIBLE);
        }
    }
}