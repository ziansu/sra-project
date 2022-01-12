@java.lang.Override
protected void onCreate(android.os.Bundle savedState) {
    super.onCreate(savedState);
    executeRequest(venuesInteractor.getVenues(0), new biz.stratadigm.tpi.presenter.VenuesPresenter.VenuesSubscriber());
}