@java.lang.Override
protected void onProgressUpdate(java.lang.Long... values) {
    if (((totalSize) == (-1)) || (updateTotal)) {
        totalSize = values[0];
        state = TaskState.TRANSFERRING;
        return ;
    }
    state = TaskState.TRANSFERRING;
    finished = values[0];
    downloadStateListener.onFileDownloadProgress(taskID);
}