@org.junit.Test
public void theServiceDetailsAreUpdatedAfterServiceDetaches() {
    wearApp.detach(notificationPresenter);
    uk.co.rossbeazley.trackmytrain.android.Train expectedTrain = new uk.co.rossbeazley.trackmytrain.android.Train("anyId", "20:24", "20:22", "4", false);
    uk.co.rossbeazley.trackmytrain.android.mobile.tracking.Postman.NodeId anyId = new uk.co.rossbeazley.trackmytrain.android.mobile.tracking.Postman.NodeId("anyId");
    uk.co.rossbeazley.trackmytrain.android.wear.MessageEnvelope message = new uk.co.rossbeazley.trackmytrain.android.wear.MessageEnvelope(anyId, new uk.co.rossbeazley.trackmytrain.android.wear.TrackedServiceMessage(expectedTrain));
    wearApp.message(message);
    org.hamcrest.MatcherAssert.assertThat(notificationPresenter.lastPresentedTrain, org.hamcrest.CoreMatchers.is(org.hamcrest.CoreMatchers.nullValue()));
}