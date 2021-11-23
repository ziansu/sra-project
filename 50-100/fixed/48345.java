@java.lang.Override
public void onSuccess(java.util.List<com.kayako.sdk.messenger.message.Message> messageList, int offset) {
    if ((mExistingMessagesHelper.getLastSuccessfulOffset()) == 0) {
        mView.scrollToBottomOfList();
    }
    mExistingMessagesHelper.onLoadNextMessages(messageList, offset);
    mOptimisticMessageHelper.removeOptimisticMessagesThatSuccessfullyGotSent(messageList);
    mListHelper.displayList();
    mMarkReadHelper.markLastMessageAsRead(mMarkReadHelper.extractLastMessageId(messageList), mExistingConversationHelper.getConversationId());
}