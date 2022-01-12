public java.nio.channels.Selector getSelector() {
    if ((selector) == null) {
        synchronized(this) {
            if ((selector) == null) {
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