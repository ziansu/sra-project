public void onIRCEvent(int what, java.lang.Object o) {
    com.irccloud.android.IRCCloudJSONObject obj;
    switch (what) {
        case com.irccloud.android.NetworkConnection.EVENT_USERINFO :
            try {
                dismiss();
            } catch (java.lang.Exception e) {
            }
            break;
        default :
            break;
    }
}