@java.lang.Override
public void run() {
    synchronized(this) {
        if ((!(mIsRunning)) && (!(mTasks.isEmpty()))) {
            mIsRunning = true;
            mTasks.remove(0).run(mFinishCallback);
        }
    }
}