@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode != (RESULT_OK)) {
        quitApplication();
        return ;
    }
    messageList.clear();
    messageListAdapter.notifyDataSetChanged();
    setLoginInfo(data.getStringExtra(ChronoChatService.EXTRA_USERNAME), data.getStringExtra(ChronoChatService.EXTRA_CHATROOM), data.getStringExtra(ChronoChatService.EXTRA_PREFIX));
    joinChatroom();
}