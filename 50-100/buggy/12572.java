public void onUserRemoved(int userId) {
    com.android.server.AppWidgetServiceImpl impl = mAppWidgetServices.get(userId);
    if (userId < 1)
        return ;
    
    if (impl == null) {
        com.android.server.AppWidgetServiceImpl.getSettingsFile(userId).delete();
    }else {
        impl.onUserRemoved();
    }
}