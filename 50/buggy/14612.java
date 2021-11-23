public void StartWifi() {
    android.content.Intent intent = new android.content.Intent(this, pt.inesc.termite.wifidirect.service.SimWifiP2pService.class);
    bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    mBound = true;
    new pt.ulisboa.tecnico.cmov.ubibike.WifiDirect.MsgSenderActivity.IncommingCommTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    guiUpdateDisconnectedState();
}