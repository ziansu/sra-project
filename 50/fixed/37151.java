@java.lang.Override
protected void onPostExecute(java.lang.Object o) {
    if ((listener) == null) {
        return ;
    }
    if (o != null) {
        listener.onGet(o);
    }else {
        listener.onNotFound(key);
    }
}