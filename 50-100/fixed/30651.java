@java.lang.Override
public void memeDisconnectCallback() {
    if (!(cordova.getActivity())) {
        return false;
    }
    cordova.getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            debug(((("Disconnected from " + address) + ", isConnected = ") + (mMemeLib.isConnected())));
            sendConnectionData(address, com.jins_jp.meme.plugin.JinsMemePlugin.ConnectionHandler.CONNECTION_STATUS_DISCONNECT, callbackContext);
        }
    });
}