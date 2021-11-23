@java.lang.Override
protected void onPostExecute(java.lang.String res) {
    super.onPostExecute(res);
    if ((showRouteHandler) != null) {
        android.os.Message msg = showRouteHandler.obtainMessage(com.jstakun.gms.android.ui.AsyncTaskManager.SHOW_ROUTE_MESSAGE, filename);
        showRouteHandler.handleMessage(msg);
    }
    if (!(silent)) {
        intents.showInfoToast(res);
    }
}