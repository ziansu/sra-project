boolean onActivityDestroyed(int userId, android.os.IBinder token) {
    synchronized(mHistory) {
        optimizeTasksLocked();
        com.lody.virtual.server.am.ActivityRecord r = findActivityByToken(userId, token);
        if (r != null) {
            synchronized(r.task.activities) {
                r.task.activities.remove(r);
                if (r.task.activities.isEmpty()) {
                    mHistory.remove(r.task.taskId);
                    return true;
                }
            }
        }
        return false;
    }
}