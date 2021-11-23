@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.irccloud.android.fragment.MessageViewFragment.tapTimer = new java.util.Timer("message-tap-timer");
    conn = com.irccloud.android.NetworkConnection.getInstance();
}