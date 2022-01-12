@java.lang.Override
public void memeConnectCallback(boolean status) {
    if ((cordova.getActivity()) == null) {
        return false;
    }
    cordova.getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            debug(((("Connected to " + address) + ", isConnected = ") + (mMemeLib.isConnected())));
            sendConnectionData(address, com.jins_jp.meme.plugin.JinsMemePlugin.ConnectionHandler.CONNECTION_STATUS_CONNECT, callbackContext);
        }
    });
}