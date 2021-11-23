@java.lang.Override
protected void onCreate(android.os.Bundle savedState) {
    super.onCreate(savedState);
    android.util.Log.v(biz.stratadigm.tpi.presenter.VenuesPresenter.TAG, "VenuesPresenter: onCreate");
    executeRequest(venuesInteractor.getVenues(0), new biz.stratadigm.tpi.presenter.VenuesPresenter.VenuesSubscriber());
}