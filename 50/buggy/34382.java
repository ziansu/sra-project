@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    serverAsistenClientAsyncTaskCallbackTarget.onCallback(response);
    serverAsistenClientAsyncTaskSocketStore.setSocket(socket);
    super.onPostExecute(result);
}