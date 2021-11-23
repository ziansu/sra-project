public final void removeOnProgressListener(com.door43.util.tasks.ManagedTask.OnProgressListener listener) {
    if (listener != null) {
        mProgressListeners.remove(listener);
    }
}