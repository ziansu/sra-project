@java.lang.Override
public void onCreate(android.os.Bundle savedInstance) {
    super.onCreate(savedInstance);
    long eventId = getArguments().getLong(com.example.nobell.project3.ui.WriteEventFragment.KEY_EVENT);
    mEvent = com.example.nobell.project3.dataset.Event.flushCache(eventId);
    mTags = mEvent.getTags();
    if ((mTags) == null) {
        mTags = new java.util.ArrayList<com.example.nobell.project3.dataset.Tag>();
    }
    mFriends = mEvent.getFriends();
    if ((mFriends) == null) {
        mFriends = new java.util.ArrayList<com.example.nobell.project3.dataset.Friend>();
    }
}