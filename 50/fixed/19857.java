@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    if ((this.listener) != null) {
        this.listener.onSearchForDevicesOnNetworkComplete(this.results);
    }
}