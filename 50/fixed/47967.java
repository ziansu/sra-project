@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((com.irccloud.android.fragment.MessageViewFragment.tapTimer) == null)
        com.irccloud.android.fragment.MessageViewFragment.tapTimer = new java.util.Timer("message-tap-timer");
    
    conn = com.irccloud.android.NetworkConnection.getInstance();
}