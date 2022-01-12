@java.lang.Override
public void call(com.adamin.android.qdbus.domain.stationsearch.SearchBusWrapper searchBusWrapper) {
    if ((null == (searchBusWrapper.getData())) || ((searchBusWrapper.getData().size()) == 0)) {
        android.support.design.widget.Snackbar.make(recyclerView, "没有查询到内容", Snackbar.LENGTH_SHORT).show();
        android.util.Log.e("查询结果", "没有查询到内容");
    }else {
        android.support.design.widget.Snackbar.make(recyclerView, "查询数据成功", Snackbar.LENGTH_SHORT).show();
        searchBusDomainsout.addAll(searchBusWrapper.getData());
        searchByNameAdapter.notifyDataSetChanged();
    }
}