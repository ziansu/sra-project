private boolean isExtraInfoValid(java.lang.Object extraInfo) {
    if ((extraInfo == null) || (!(extraInfo instanceof com.android.storagemanager.deletionhelper.AppStateUsageStatsBridge.UsageStatsState))) {
        return false;
    }
    com.android.storagemanager.deletionhelper.AppStateUsageStatsBridge.UsageStatsState state = ((com.android.storagemanager.deletionhelper.AppStateUsageStatsBridge.UsageStatsState) (extraInfo));
    if (((state.daysSinceFirstInstall) == (com.android.storagemanager.deletionhelper.AppStateUsageStatsBridge.UNKNOWN_LAST_USE)) || ((state.daysSinceLastUse) == (com.android.storagemanager.deletionhelper.AppStateUsageStatsBridge.UNKNOWN_LAST_USE))) {
        return false;
    }
    long mostRecentUse = java.lang.Math.max(state.daysSinceFirstInstall, state.daysSinceLastUse);
    return (mostRecentUse >= (mUnusedDaysThreshold)) || (mostRecentUse == (com.android.storagemanager.deletionhelper.AppStateUsageStatsBridge.NEVER_USED));
}