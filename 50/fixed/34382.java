@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    serverAsistenClientAsyncTaskCallbackTarget.onCallback(response);
    serverAsistenClientAsyncTaskSocketStore.setSocket(socket);
}