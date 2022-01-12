protected void initiateAutomaticSync() {
    if (((filter.title) == null) || (!(filter.title.equals(getString(R.string.BFE_Active)))))
        return ;
    
    long lastAutoSync = com.todoroo.andlib.utility.Preferences.getLong(com.todoroo.astrid.activity.TaskListActivity.PREF_LAST_AUTO_SYNC, 0);
    if (((com.todoroo.andlib.utility.DateUtilities.now()) - lastAutoSync) > (com.todoroo.andlib.utility.DateUtilities.ONE_HOUR)) {
        performSyncServiceV2Sync(false);
    }
}