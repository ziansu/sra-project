private void startHttpThread(java.lang.String cmd, java.lang.String url, java.lang.String pollInterval, java.lang.String data) {
    eu.musesproject.client.connectionmanager.ConnectionManager.HttpClientAsyncThread httpClientAsyncThread = new eu.musesproject.client.connectionmanager.ConnectionManager.HttpClientAsyncThread();
    httpClientAsyncThread.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, cmd, url, pollInterval, data, eu.musesproject.client.connectionmanager.ConnectionManager.certificate);
}