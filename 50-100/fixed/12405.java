final void setFrontOfTask() {
    boolean foundFront = false;
    final int numActivities = mActivities.size();
    for (int activityNdx = 0; activityNdx < numActivities; ++activityNdx) {
        final com.android.server.am.ActivityRecord r = mActivities.get(activityNdx);
        if (foundFront || (r.finishing)) {
            r.frontOfTask = false;
        }else {
            r.frontOfTask = true;
            foundFront = true;
        }
    }
}