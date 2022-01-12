public java.rmi.registry.Registry startRMIserver() {
    java.rmi.registry.Registry registry = null;
    try {
        java.lang.System.out.println("RMI server started");
        java.lang.System.setProperty("java.rmi.server.useLocalHostname", inIP);
        java.lang.System.setProperty("java.rmi.server.logCalls", "true");
        java.lang.System.getProperties().put("java.rmi.server.hostname", exIP);
        registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
        java.lang.System.out.println("java RMI registry created.");
    } catch (java.rmi.RemoteException e) {
        java.lang.System.out.println("java RMI registry already exists.");
        java.lang.System.out.println("Or the RMI server is already running");
    }
    return registry;
}