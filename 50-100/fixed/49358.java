@java.lang.Override
protected boolean handleActionViewConversation(android.net.Uri uri, android.os.Bundle args) {
    mGroupJID = uri.getPathSegments().get(1);
    mConversation = org.kontalk.data.Conversation.loadFromUserId(getActivity(), mGroupJID);
    if ((mConversation) == null) {
        org.kontalk.Log.i(org.kontalk.ui.GroupMessageFragment.TAG, (("conversation for " + (mGroupJID)) + " not found - exiting"));
        return false;
    }
    setThreadId(mConversation.getThreadId());
    mUserName = mGroupJID;
    return true;
}