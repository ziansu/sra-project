@org.junit.Test
public void privateChannelsIdsForAUserAreObservedFromPrivateChannelDatabase() {
    rx.Observable<java.util.List<java.lang.String>> listObservable = firebaseChannelsDatabase.observePrivateChannelIdsFor(user);
    com.novoda.bonfire.helpers.FirebaseTestHelpers.assertValueReceivedOnNext(listObservable, privateChannelIds);
}