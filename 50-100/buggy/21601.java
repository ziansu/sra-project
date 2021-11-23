private void runNextTask() {
    synchronized(this) {
        if ((!(mIsRunning)) && (!(mTasks.isEmpty()))) {
            mIsRunning = true;
            com.datdo.mobilib.util.MblUtils.getMainThreadHandler().post(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    mTasks.remove(0).run(mFinishCallback);
                }
            });
        }
    }
}