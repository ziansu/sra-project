static void loadDataValues(android.content.Context context, org.hisp.dhis.android.sdk.network.DhisApi dhisApi) throws org.hisp.dhis.android.sdk.network.APIException {
    org.hisp.dhis.android.sdk.persistence.Dhis2Application.getEventBus().post(new org.hisp.dhis.android.sdk.events.UiEvent(UiEvent.UiEventType.SYNCING_START));
    try {
        org.hisp.dhis.android.sdk.controllers.tracker.TrackerController.synchronizeDataValues(context, dhisApi);
    } catch (org.hisp.dhis.android.sdk.network.APIException e) {
        org.hisp.dhis.android.sdk.persistence.Dhis2Application.getEventBus().post(new org.hisp.dhis.android.sdk.events.UiEvent(UiEvent.UiEventType.SYNCING_END));
        throw e;
    }
    org.hisp.dhis.android.sdk.persistence.Dhis2Application.getEventBus().post(new org.hisp.dhis.android.sdk.events.UiEvent(UiEvent.UiEventType.SYNCING_END));
}