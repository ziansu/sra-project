@java.lang.Override
protected void onPostExecute(java.lang.Long chatId) {
    if (chatId != (-1)) {
        android.content.Intent intent = new android.content.Intent(this, org.awesomeapp.messenger.ui.ConversationDetailActivity.class);
        intent.putExtra("id", chatId);
        startActivity(intent);
        finish();
    }
    super.onPostExecute(chatId);
}