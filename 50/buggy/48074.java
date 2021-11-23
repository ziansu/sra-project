@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    updateDisplay(result);
    mSocketsClient.cancel(true);
}