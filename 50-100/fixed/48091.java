private void addFunction() {
    for (int i : mIndex) {
        java.util.ArrayList<java.lang.Object> itemBean = mData.get(i);
        if (((int) (itemBean.get(POS_MARK))) == (MARK_ADD)) {
            itemBean.set(POS_MARK, MARK_INVISIBLE);
            itemBean.set(POS_ENABLE, true);
            (functionCount)++;
        }
    }
}