public boolean deleteSelected() {
    if ((mSelected) < 0) {
        return false;
    }
    android.util.Log.i(DEBUG_TAG, ("Selected: " + (mSelected)));
    return com.appers.ayvaz.thetravelingsalesman.models.TaskManager.get(mContext).delete(mTasks.get(mSelected).getEventID());
}