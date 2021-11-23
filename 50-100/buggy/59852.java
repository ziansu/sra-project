private void toggleProgressIfGroupsShowing() {
    if (org.grassroot.android.services.GroupService.isFetchingGroups) {
        android.util.Log.d(TAG, "group service is fetching, hence showing ...");
        showProgress();
    }else
        if ((groupListRowAdapter) == null) {
            android.util.Log.d(TAG, "groupListRowAdaper null, showing dialog ...");
            showProgress();
        }else
            if ((groupListRowAdapter.getItemCount()) == 0) {
                android.util.Log.d(TAG, "groupListAdapter empty, hence showing ...");
                showProgress();
            }else {
                android.util.Log.e(TAG, "neither of the above, hence hiding");
                hideProgress();
            }
        
    
}