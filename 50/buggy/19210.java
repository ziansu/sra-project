@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    super.onPostExecute(result);
    if (result.equals(false)) {
        cl.smartcities.isci.transportinspector.serverConnection.ServerConnectionController.ShowOfflineMessage();
    }else {
        cl.smartcities.isci.transportinspector.serverConnection.ServerConnectionController.HideOfflineMessage();
    }
}