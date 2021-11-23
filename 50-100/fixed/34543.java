@java.lang.Override
protected void onPostExecute(java.lang.String response) {
    if ((localUri) != null) {
        com.superchat.ui.ChatListAdapter.processing.remove(localUri);
    }
    android.database.Cursor cursor1 = null;
    if (isBulletinBroadcast) {
        cursor1 = com.chat.sdk.db.ChatDBWrapper.getInstance().getUserChatList(chatName, com.superchat.ui.ChatListAdapter.CHAT_LIST_BULLETIN);
    }else {
        cursor1 = com.chat.sdk.db.ChatDBWrapper.getInstance().getUserChatList(chatName, com.superchat.ui.ChatListAdapter.CHAT_LIST_NORMAL);
    }
    swapCursor(cursor1);
    notifyDataSetChanged();
    super.onPostExecute(response);
}