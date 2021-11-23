private void initList() {
    adapter = new com.alkurop.helloweather.adapter.MainAdapter();
    list.setLoadingViews(R.layout.global_loading, R.layout.list_empty);
    list.setAdapter(adapter);
    list.setSwipeRefreshListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() {
        @java.lang.Override
        public kotlin.Unit invoke() {
            presenter.onRefresh();
            return null;
        }
    });
}