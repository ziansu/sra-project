@java.lang.Override
public void connected(org.jivesoftware.smack.XMPPConnection connection) {
    android.util.Log.d("SMACK", ("BUS -- > new connection: " + (com.pz.supportchat.PostingConnectionChangeListener.CONNECTED)));
    mBus.post(new com.pz.supportchat.PostingConnectionChangeListener.XMPPConnectionStatus(com.pz.supportchat.PostingConnectionChangeListener.CONNECTED));
}