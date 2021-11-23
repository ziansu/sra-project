@java.lang.Override
public void getHistoryItems() {
    new me.aaron.zhihudaily.presenter.MainPresenter.requestHistoryItems().execute(((me.aaron.zhihudaily.presenter.MainPresenter.sHistoryItemsAPI) + (latestItemsBean.getDate())));
}