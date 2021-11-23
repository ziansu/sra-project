@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if ((progressDialog) != null) {
        progressDialog.dismiss();
    }
    if (result == null) {
        cl.smartcities.isci.transportinspector.serverConnection.ServerConnectionController.executeErrorListener(request, error);
        for (cl.smartcities.isci.transportinspector.serverConnection.ServerConnection.ServerErrorListener listener : errorListeners) {
            listener.notifyServerError(error);
        }
    }else {
        cl.smartcities.isci.transportinspector.serverConnection.ServerConnectionController.executeResponseListener(request, result);
    }
}