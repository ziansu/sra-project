public boolean allTasksCompleted() {
    for (com.laytonlabs.android.todotoday.Task t : mTasks) {
        if (!(t.isCompleted())) {
            return false;
        }
    }
    return true;
}