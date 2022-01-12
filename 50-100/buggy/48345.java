@java.lang.Override
public void onSuccess(java.util.List<com.kayako.sdk.messenger.message.Message> messageList, int offset) {
    mExistingMessagesHelper.onLoadNextMessages(messageList, offset);
    mOptimisticMessageHelper.removeOptimisticMessagesThatSuccessfullyGotSent(messageList);
    mListHelper.displayList();
    if ((mExistingMessagesHelper.getLastSuccessfulOffset()) == 0) {
        mView.scrollToBottomOfList();
    }
    mMarkReadHelper.markLastMessageAsRead(mMarkReadHelper.extractLastMessageId(messageList), mExistingConversationHelper.getConversationId());
}