@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d(Constants.MsgInfo, "Service started");
    storedData = new dimappers.android.pub.StoredData();
    user = ((dimappers.android.PubData.User) (intent.getExtras().getSerializable(Constants.CurrentFacebookUser)));
    receiver = new dimappers.android.pub.DataReceiver(this);
    sender = new dimappers.android.pub.DataSender();
    return START_STICKY;
}