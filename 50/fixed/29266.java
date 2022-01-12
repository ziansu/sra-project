@java.lang.Override
public android.database.Cursor runQuery(java.lang.CharSequence constraint) {
    if (de.robv.android.xposed.installer.XposedApp.getInstance().areDownloadsEnabled()) {
        return de.robv.android.xposed.installer.repo.RepoDb.queryModuleOverview(mSortingOrder, constraint);
    }else {
        return null;
    }
}