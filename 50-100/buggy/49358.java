@java.lang.Override
protected void handleActionViewConversation(android.net.Uri uri, android.os.Bundle args) {
    mGroupJID = uri.getPathSegments().get(1);
    mConversation = org.kontalk.data.Conversation.loadFromUserId(getActivity(), mGroupJID);
    if ((mConversation) == null) {
        org.kontalk.Log.i(org.kontalk.ui.GroupMessageFragment.TAG, (("conversation for " + (mGroupJID)) + " not found - exiting"));
        getActivity().finish();
    }
    setThreadId(mConversation.getThreadId());
    mUserName = mGroupJID;
}