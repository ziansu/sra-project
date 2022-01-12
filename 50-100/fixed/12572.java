public void onUserRemoved(int userId) {
    if (userId < 1)
        return ;
    
    synchronized(mAppWidgetServices) {
        com.android.server.AppWidgetServiceImpl impl = mAppWidgetServices.get(userId);
        mAppWidgetServices.remove(userId);
        if (impl == null) {
            com.android.server.AppWidgetServiceImpl.getSettingsFile(userId).delete();
        }else {
            impl.onUserRemoved();
        }
    }
}