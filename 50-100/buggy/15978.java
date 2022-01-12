public void closeSocket() {
    try {
        if ((client) != null) {
            synchronized(this) {
                if ((client) != null) {
                    selector.close();
                    client.socket().close();
                    client.close();
                    client = null;
                    selector = null;
                }
            }
        }
    } catch (java.io.IOException ioe) {
        java.lang.System.err.println(("NetworkManager.closeSocket().IOException.Message=" + (ioe.getMessage())));
    }
}