@java.lang.Override
public void onStreamReceived(com.opentok.android.Session session, com.opentok.android.Stream stream) {
    for (demo.tokbox.com.multiparty.MultipartyActivity.SubscriberContainer subscriber : _subsrciberLst) {
        if (null == (subscriber.getStream())) {
            _subscribeStream(subscriber, stream);
            break;
        }
    }
}