@java.lang.Override
protected void getView(java.util.List<com.baozou.rxjavaexample.model.ItemBean> itemBeans, android.widget.ListView listView) {
    view = mInflate.inflate(R.layout.adapteritem_main_item, listView, false);
    butterknife.ButterKnife.bind(this, view);
    dealWithTheView(itemBeans);
    listView.addHeaderView(view);
}