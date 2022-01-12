public synchronized void setPostPosition(android.content.Context context, boolean isEnabled) {
    setChangeStatus(this.postPosition, isEnabled);
    this.postPosition = isEnabled;
    com.joylabs.mclubtracker.utils.Storage.saveInt(context, com.joylabs.mclubtracker.transactions.user.UserInfo.POST_POSITION_KEY, (postPosition ? 1 : -1));
    notifyPostService(context);
    notifyObservers();
}