public void setAdapter(com.qiyei.sdk.view.IndicatorView.IndicatorAdapter adapter) {
    if (adapter == null) {
        throw new java.lang.NullPointerException("adapter cannot be null");
    }
    this.mAdapter = adapter;
    int count = mAdapter.getCount();
    for (int i = 0; i < count; i++) {
        android.view.View itemView = mAdapter.getView(i, mIndicatorContainer);
        mIndicatorContainer.addItemView(itemView);
        switchIndicatorClick(itemView, i);
    }
}