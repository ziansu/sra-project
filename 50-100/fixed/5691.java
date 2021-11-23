public synchronized com.google.android.gms.analytics.Tracker get(org.gtlp.yasb.AnalyticsTrackers.Target target) {
    if (!(mTrackers.containsKey(target))) {
        com.google.android.gms.analytics.Tracker tracker;
        switch (target) {
            case APP :
                tracker = com.google.android.gms.analytics.GoogleAnalytics.getInstance(mContext).newTracker(R.xml.app_tracker);
                break;
            default :
                throw new java.lang.IllegalArgumentException(("Unhandled analytics target " + target));
        }
        mTrackers.put(target, tracker);
    }
    return mTrackers.get(target);
}