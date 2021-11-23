public synchronized io.sharif.pavilion.network.Utilities.ActionResult stop() {
    if (receiverRegistered) {
        this.context.unregisterReceiver(this);
        receiverRegistered = false;
    }
    if ((clientScanner) != null)
        clientScanner.interrupt();
    
    closeClients();
    if ((closeServerSocket()) == (io.sharif.pavilion.network.Utilities.ActionResult.SUCCESS)) {
        if ((serverListener) != null)
            serverListener.onServerStopped();
        
        return enableWifiAp(null, false) ? io.sharif.pavilion.network.Utilities.ActionResult.SUCCESS : io.sharif.pavilion.network.Utilities.ActionResult.FAILURE;
    }else
        return io.sharif.pavilion.network.Utilities.ActionResult.FAILURE;
    
}