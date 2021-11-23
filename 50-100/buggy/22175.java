@java.lang.Override
public void messageReceived(com.vtromeur.jagger.xmpp.XMPPMessage message) {
    android.widget.Toast.makeText(getActivity(), ((R.string.message_received) + (message.getMessage())), Toast.LENGTH_SHORT).show();
    mMessages.add(message);
    addMessageToList(message);
    scrollDown();
}