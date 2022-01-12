@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    try {
        mCliSocket = new pt.inesc.termite.wifidirect.sockets.SimWifiP2pSocket(params[0], port);
    } catch (java.net.UnknownHostException e) {
        return "Unknown Host:" + (e.getMessage());
    } catch (java.io.IOException e) {
        return "IO error:" + (e.getMessage());
    }
    return null;
}