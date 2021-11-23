@java.lang.Override
public void success(java.util.List<com.magicmicky.habitrpgwrapper.lib.models.ChatMessage> chatMessages, retrofit.client.Response response) {
    currentChatMessages = chatMessages;
    com.habitrpg.android.habitica.ui.adapter.ChatRecyclerViewAdapter tavernAdapter = new com.habitrpg.android.habitica.ui.adapter.ChatRecyclerViewAdapter(chatMessages, ctx, userId, groupId, isTavern);
    if ((mRecyclerView) != null) {
        mRecyclerView.setAdapter(tavernAdapter);
    }
    if ((swipeRefreshLayout) != null) {
        swipeRefreshLayout.setRefreshing(false);
    }
}