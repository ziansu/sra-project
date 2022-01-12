public void addFirstItem(T bean) {
    java.util.List<T> tempBeans = new java.util.ArrayList<>();
    tempBeans.add(bean);
    tempBeans.addAll(mAllDatas);
    mAllDatas.clear();
    mAllDatas = tempBeans;
    com.rsen.base.RBaseAdapter.notifyItemInserted(0);
}