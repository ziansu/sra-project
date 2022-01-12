@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.stoyanov.developer.goevent.mvp.model.domain.Event>> loader, java.util.List<com.stoyanov.developer.goevent.mvp.model.domain.Event> data) {
    android.util.Log.d(com.stoyanov.developer.goevent.mvp.presenter.ListEventsPresenter.TAG, "onLoadFinished: ");
    if ((data != null) && ((data.size()) > 0)) {
        getView().showEvents(data);
    }else {
        getView().showEmpty();
    }
    getView().showProgressBar(false);
}