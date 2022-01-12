@java.lang.Override
protected void initiateAutomaticSync() {
    long lastAutoSync = com.todoroo.andlib.utility.Preferences.getLong(((com.todoroo.astrid.actfm.TagViewActivity.LAST_FETCH_KEY) + (tagData.getId())), 0);
    if (((com.todoroo.andlib.utility.DateUtilities.now()) - lastAutoSync) > (com.todoroo.andlib.utility.DateUtilities.ONE_HOUR))
        refreshData(false);
    
}