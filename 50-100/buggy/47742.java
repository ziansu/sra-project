public void deleteItem(T bean) {
    if ((mAllDatas) != null) {
        int size = mAllDatas.size();
        int indexOf = mAllDatas.indexOf(bean);
        if (indexOf > (-1)) {
            if (onDeleteItem(bean)) {
                mAllDatas.remove(bean);
                com.rsen.base.RBaseAdapter.notifyItemRemoved(indexOf);
                com.rsen.base.RBaseAdapter.notifyItemRangeChanged(indexOf, (size - indexOf));
            }
        }
    }
}