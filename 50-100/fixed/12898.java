@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_chat);
    if (!(checkServiceAlive())) {
        return ;
    }
    mChatView.setLeftBubbleColor(Color.WHITE);
    mChatView.setSendIcon(R.drawable.ic_action_send);
    mChatView.setRightMessageTextColor(Color.WHITE);
    mChatView.setLeftMessageTextColor(Color.BLACK);
    mChatView.setUsernameTextColor(Color.BLACK);
    mChatView.setSendTimeTextColor(Color.BLACK);
    mChatView.setDateSeparatorColor(Color.WHITE);
    Reflash();
}