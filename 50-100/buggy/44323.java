public void updateChatDialog() {
    com.hbpu.flat.MainActivity.checkSendPersion();
    com.hbpu.flat.MainActivity.initChatDialog();
    android.os.SystemClock.sleep(20);
    com.hbpu.flat.ChatAdapter chatAdapter = new com.hbpu.flat.ChatAdapter(this, com.hbpu.flat.MainActivity.personChats, (-1), false, false);
    com.hbpu.flat.MainActivity.mChatDialog.setAdapter(chatAdapter);
    com.hbpu.flat.MainActivity.chatMsgHandler.sendEmptyMessage(1);
}