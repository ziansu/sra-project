void startCallback(Client clientCallback) {
    try {
        Servercallback callbackStub = ((Servercallback) (java.rmi.server.UnicastRemoteObject.exportObject(clientCallback, 0)));
        java.rmi.registry.Registry callbackRegistry = java.rmi.registry.LocateRegistry.getRegistry();
        callbackRegistry.bind("Servercallback", callbackStub);
        java.lang.System.err.println("Waiting for Callback");
        boolean loop = true;
        while (loop) {
            if (callback = true) {
                loop = false;
            }
        } 
        java.lang.System.out.println("Your question has been claimed");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("startCallback error");
        e.printStackTrace();
    }
}