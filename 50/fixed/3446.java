@org.junit.Test
public void privateChannelsIdsForAUserAreObservedFromPrivateChannelDatabase() {
    rx.Observable<java.util.List<java.lang.String>> listObservable = firebaseChannelsDatabase.observePrivateChannelIdsFor(user);
    assertValueReceivedOnNext(listObservable, privateChannelIds);
}