@java.lang.Override
public void showOrders(@android.support.annotation.NonNull
java.util.List<com.e1858.building.data.bean.BaseOrder> orders) {
    mAdapter.updateDataSet(processData(orders), true);
    mAdapter.setEndlessProgressItem(new com.e1858.building.base.LoadMoreProgressItem());
}