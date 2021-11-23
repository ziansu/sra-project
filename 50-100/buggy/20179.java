public static void recreateRefreshPeriodicSync(android.content.Context context, android.accounts.Account account, java.lang.String url, int monitorId, int interval) {
    if (interval < (com.colinwhite.ping.data.PingContract.MonitorEntry.PING_FREQUENCY_MAX)) {
        com.colinwhite.ping.sync.PingSyncAdapter.removePeriodicSync(context, url, monitorId);
        com.colinwhite.ping.sync.PingSyncAdapter.createPeriodicSync(context, url, monitorId, ((int) (java.util.concurrent.TimeUnit.MINUTES.toSeconds(com.colinwhite.ping.Utility.PING_FREQUENCY_MINUTES[interval]))));
    }
    com.colinwhite.ping.sync.PingSyncAdapter.syncImmediately(context, account, url, monitorId);
}