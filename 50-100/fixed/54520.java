boolean clearPendingActivityLaunchesLocked(java.lang.String packageName) {
    boolean didSomething = false;
    for (int palNdx = (mPendingActivityLaunches.size()) - 1; palNdx >= 0; --palNdx) {
        com.android.server.am.ActivityStackSupervisor.PendingActivityLaunch pal = mPendingActivityLaunches.get(palNdx);
        com.android.server.am.ActivityRecord r = pal.r;
        if ((r != null) && (r.packageName.equals(packageName))) {
            mPendingActivityLaunches.remove(palNdx);
            didSomething = true;
        }
    }
}