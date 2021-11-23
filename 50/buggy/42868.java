@java.lang.Override
public synchronized void onCreate() {
    android.util.Log.d(org.makeathon.telepresenceslave.SlaveService.TAG, "onCreate");
    org.makeathon.telepresenceslave.SlaveService.sInstance = this;
    mPubnub = new com.pubnub.api.Pubnub("pub-c-e0e0e558-9aa1-412e-a4ca-ce286e939e54", "sub-c-4b5e362c-27fd-11e6-84f2-02ee2ddab7fe");
    pubnubConnect();
}