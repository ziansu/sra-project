@java.lang.Override
public void run() {
    int clientNumber = 0;
    try {
        com.musichub.core.CapitalizeServer.server = new com.musichub.core.CapitalizeServer.Capitalizer();
        try {
            while (true) {
                com.musichub.core.CapitalizeServer.log(("Waiting.. next is " + clientNumber));
                com.musichub.core.CapitalizeServer.server.addListener(com.musichub.core.CapitalizeServer.listener.accept(), (clientNumber++), threshold);
                if (clientNumber == 1) {
                    com.musichub.core.CapitalizeServer.server.start();
                }
            } 
        } finally {
            com.musichub.core.CapitalizeServer.listener.close();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}