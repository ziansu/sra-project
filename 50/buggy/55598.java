private void initView() {
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.recycler_view)));
    mPresenter = new com.lxy.stock.presenter.StockPresenter();
}