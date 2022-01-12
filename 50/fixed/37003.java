public void addPostDrawTask(final java.lang.Runnable runnable) {
    synchronized(mPostDrawTaskList) {
        mPostDrawTaskList.addLast(runnable);
    }
}