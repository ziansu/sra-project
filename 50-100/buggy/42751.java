@java.lang.SuppressWarnings(value = "unused")
@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onSiteChanged(org.wordpress.android.fluxc.store.SiteStore.OnSiteChanged event) {
    if ((!(org.wordpress.android.WordPress.sIsMigrationInProgress)) || ((org.wordpress.android.WordPress.sMigrationListener) == null)) {
        return ;
    }
    if ((mRemainingSelfHostedSitesToFetch) == 0) {
        org.wordpress.android.util.AppLog.i(T.DB, "Access token migrated and WP.com sites fetched - attempting to migrate self-hosted sites");
        migrateSelfHostedSites();
    }else
        if ((mRemainingSelfHostedSitesToFetch) > 1) {
            (mRemainingSelfHostedSitesToFetch)--;
            org.wordpress.android.util.AppLog.i(T.DB, ("Self-hosted sites remaining to fetch for migration: " + (mRemainingSelfHostedSitesToFetch)));
        }else {
            org.wordpress.android.util.AppLog.i(T.DB, "The last self-hosted site has been fetched - starting draft migration");
            migrateDrafts();
        }
    
}