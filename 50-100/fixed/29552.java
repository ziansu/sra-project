@java.lang.Override
public boolean updatedMessages(java.util.Vector<sk.boinc.androboinc.clientconnection.MessageInfo> messages) {
    if ((mMessages.size()) != (messages.size())) {
        mMessages = messages;
        if (mViewUpdatesAllowed) {
            if (sk.boinc.androboinc.debug.Logging.DEBUG)
                android.util.Log.d(sk.boinc.androboinc.MessagesActivity.TAG, "Messages are updated, refreshing view");
            
            sortMessages();
            ((android.widget.BaseAdapter) (getListAdapter())).notifyDataSetChanged();
        }else {
            if (sk.boinc.androboinc.debug.Logging.DEBUG)
                android.util.Log.d(sk.boinc.androboinc.MessagesActivity.TAG, "Messages are updated, but view refresh is delayed");
            
            mViewDirty = true;
        }
    }
    return mRequestUpdates;
}