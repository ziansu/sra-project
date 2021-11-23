@org.junit.Test
public void publicChannelsIdsAreObservedFromPublicChannelDatabase() {
    rx.Observable<java.util.List<java.lang.String>> listObservable = firebaseChannelsDatabase.observePublicChannelIds();
    com.novoda.bonfire.helpers.FirebaseTestHelpers.assertValueReceivedOnNext(listObservable, publicChannelIds);
}