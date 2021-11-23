@java.lang.Override
protected void onPostExecute(com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException ex) {
    super.onPostExecute(ex);
    if (com.spjanson.restdemo.REST.mConnected) {
        com.spjanson.restdemo.REST.mConnCBs.onConnOK();
    }else {
        com.spjanson.restdemo.REST.mConnCBs.onConnFail((ex == null ? null : ex.getIntent()));
    }
}