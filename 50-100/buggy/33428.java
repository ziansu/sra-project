public static void main(java.lang.String[] args) {
    java.lang.String host = ((args.length) < 1) ? "localhost" : args[0];
    try {
        java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.getRegistry(host, 8888);
        ClientToFronEndServer stub = ((ClientToFronEndServer) (registry.lookup("FrontEndServer")));
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("Client exception: " + (e.toString())));
    }
}