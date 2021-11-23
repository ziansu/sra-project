private com.android.server.usage.UserUsageStatsService getUserDataAndInitializeIfNeededLocked(int userId, long currentTimeMillis) {
    com.android.server.usage.UserUsageStatsService service = mUserState.get(userId);
    if (service == null) {
        service = new com.android.server.usage.UserUsageStatsService(getContext(), userId, new java.io.File(mUsageStatsDir, java.lang.Integer.toString(userId)), this);
        service.init(currentTimeMillis, getScreenOnTimeLocked(currentTimeMillis));
        mUserState.put(userId, service);
    }
    return service;
}