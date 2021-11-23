@java.lang.Override
public void onSend(java.lang.String[] recipients, java.lang.String body) {
    long threadId = com.moez.QKSMS.mmssms.Utils.getOrCreateThreadId(mContext, recipients);
    if (threadId != 0) {
        mContext.finish();
        com.moez.QKSMS.ui.messagelist.MessageListActivity.launch(mContext, threadId, (-1), null, true);
    }else {
        mContext.onBackPressed();
    }
}