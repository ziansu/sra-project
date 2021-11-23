private void getAndStartIntent(int i) {
    android.app.ActivityManager.RecentTaskInfo info = mAppList.get(i);
    if (null == info)
        android.widget.Toast.makeText(this, "No other apps", Toast.LENGTH_SHORT).show();
    else
        if (sp.getBoolean(StringKey.ExcludeHome, false)) {
            if (info.baseIntent.getComponent().getPackageName().equals(HOME_PACKAGE))
                getAndStartIntent(2);
            else
                startActivityWithoutAnimation(info);
            
        }else
            startActivityWithoutAnimation(info);
        
    
}