static void authenticate() {
    com.fhf.prkr.microclient.MainActivity.authenticated = false;
    com.fhf.prkr.microclient.MainActivity.network.sendpacket(com.fhf.prkr.microclient.MainActivity.network.MANAGEMENT, com.fhf.prkr.microclient.MainActivity.network.AUTHENTICATE, "", true);
    boolean requestFailed = false;
    while ((com.fhf.prkr.microclient.MainActivity.network.stillWaiting()) == 1) {
        if ((com.fhf.prkr.microclient.MainActivity.network.stillWaiting()) == 42) {
            requestFailed = true;
            break;
        }
    } 
    if (!requestFailed) {
        com.fhf.prkr.microclient.MainActivity.network.startKeepAlive();
    }
}