@org.junit.Test
public void canAddChannelToPrivateChannelDatabaseForUser() {
    rx.Observable<com.novoda.bonfire.channel.data.model.Channel> channelObservable = firebaseChannelsDatabase.addChannelToUserPrivateChannelIndex(user, newChannel);
    assertValueReceivedOnNext(channelObservable, newChannel);
}