private synchronized void clearStats() {
    if ((mContext) == null) {
        return ;
    }
    android.content.SharedPreferences netStats = mContext.getSharedPreferences(NetStatsStorage.NET_STATS_FILE, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = netStats.edit();
    editor.putLong(NetStatsStorage.NET_STATS_TOTAL_RCVD, 0);
    editor.putLong(NetStatsStorage.NET_STATS_TOTAL_SENT, 0);
    editor.commit();
    mTotalReceived = 0;
    mTotalSent = 0;
    mUncommittedReceived = 0;
    mUncommittedSent = 0;
}