@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    mNotificationHelper.completed();
    if (((finished) != null) && (!(error))) {
        finished.run();
    }
}