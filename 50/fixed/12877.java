@java.lang.Override
public void call() {
    logger.d(org.hisp.dhis.android.eventcapture.presenters.FormSectionPresenterImpl.TAG, "onComplete");
    gettingLocation = false;
    locationProvider.stopUpdates();
}