@java.lang.Override
public void listLoaded(java.util.List<com.amlcurran.messages.core.conversationlist.Conversation> conversations) {
    java.util.Collections.sort(conversations, preferenceStore.getConversationSortComparator());
    source.replace(conversations);
    conversationListView.hideLoadingUi();
    if ((conversations.size()) == 0) {
        conversationListView.showEmptyUi();
    }else {
        conversationListView.hideEmptyUi();
    }
}