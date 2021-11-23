public boolean delete(int position) {
    android.util.Log.i(DEBUG_TAG, ("Selected: " + position));
    if ((position < 0) || (position > (mTasks.size()))) {
        return false;
    }
    return com.appers.ayvaz.thetravelingsalesman.models.TaskManager.get(mContext).delete(mTasks.get(position).getEventID());
}