@java.lang.Override
public void close() {
    try {
        socket.close();
        reload.close();
        handler.getWindow().showError(de.jattyv.jcapi.client.network.CON_FAIL);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(de.jattyv.jcapi.client.network.Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}