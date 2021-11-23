@java.lang.Override
protected void onPreExecute() {
    if ((searchTaskCallbacks) != null) {
        setLoadingON();
        searchTaskCallbacks.onPreExecute();
    }
}