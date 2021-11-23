@org.junit.Test
public void channelDetailsAreReadFromChannelsDatabase() {
    rx.Observable<com.novoda.bonfire.channel.data.model.Channel> channelObservable = firebaseChannelsDatabase.readChannelFor("new channel");
    com.novoda.bonfire.helpers.FirebaseTestHelpers.assertValueReceivedOnNext(channelObservable, newChannel);
}