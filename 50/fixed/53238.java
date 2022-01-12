@java.lang.Override
public void forkRandomCallLogs(android.content.Context context, int quantity) {
    if ((mForkBinder) != null) {
        mForkBinder.startFork(ForkTask.FORK_TYPE_RANDOM_CALLLOGS, quantity);
    }
}