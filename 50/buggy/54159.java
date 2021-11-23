public boolean updateSubscribed(int eventID, boolean subscribed) {
    long updated = mDataHelper.updateSubscribed(eventID, subscribed);
    mDataSetChanged = true;
    syncData();
    return updated != (-1);
}