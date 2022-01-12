public java.nio.channels.Selector getSelector() {
    while ((selector) == null) {
        synchronized(this) {
            while ((selector) == null) {
                try {
                    wait();
                } catch (java.lang.InterruptedException e) {
                    java.lang.System.err.println(("NetworkManager.getSocket().IOException.Message=" + (e.getMessage())));
                    throw new java.lang.RuntimeException(e);
                }
            } 
        }
    } 
    return selector;
}