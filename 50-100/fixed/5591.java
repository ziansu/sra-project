@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    if ((exception) == null) {
        postExecute();
        if ((callback) != null) {
            callback.onResult(returnedData);
        }
    }
    if ((lock) != null) {
        synchronized(lock) {
            lock.notifyAll();
        }
    }
}