@java.lang.Override
protected void onPause() {
    android.util.Log.v(com.example.andrea.tabsactionbar.chat.ConversationActivity.TAG, "onPause");
    if (bound) {
        unregisterConversation();
        unbindService(mConnection);
        mService = null;
    }
    super.onPause();
}