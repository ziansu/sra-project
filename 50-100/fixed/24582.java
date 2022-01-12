@java.lang.Override
public void listen() {
    try {
        listener = new java.net.ServerSocket(port);
        while (running) {
            java.net.Socket s = listener.accept();
            de.jattyv.jcapi.server.network.ServerThread st = new de.jattyv.jcapi.server.network.ServerThread(s, dc);
            de.jattyv.jcapi.server.network.Client cl = new de.jattyv.jcapi.server.network.Client(st);
            cl.start();
        } 
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(de.jattyv.jcapi.server.network.JServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}