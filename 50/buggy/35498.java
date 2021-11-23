public void reload() {
    mItems = null;
    mExecutor.execute(mReloadTasks);
}