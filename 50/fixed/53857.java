public boolean allTasksCompleted() {
    if (mTasks.isEmpty())
        return false;
    
    for (com.laytonlabs.android.todotoday.Task t : mTasks) {
        if (!(t.isCompleted())) {
            return false;
        }
    }
    return true;
}