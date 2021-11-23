@butterknife.OnClick(value = R.id.btn_send)
void onSendMessage() {
    if (!(android.text.TextUtils.isEmpty(mContentEditText.getText()))) {
        com.hyphenate.chat.EMMessage message = com.hyphenate.chat.EMMessage.createTxtSendMessage(mContentEditText.getText().toString(), toChatUsername);
        com.hyphenate.chat.EMClient.getInstance().chatManager().sendMessage(message);
        mMessageListView.refreshSelectLast();
        mContentEditText.setText("");
    }
}