@java.lang.Override
public void Receiver(java.util.ArrayList<java.lang.Object> params, java.lang.String callbackId) {
    java.lang.String peerId = "";
    if ((params.size()) > 0) {
        peerId = params.get(0).toString();
    }
    mBtConnectorHelper.ReStart(peerId);
}