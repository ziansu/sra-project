public int run(final java.lang.String[] args) {
    if ((args.length) > 0) {
        java.lang.System.err.println(((appName()) + ": too many arguments"));
        return 1;
    }
    generadorDePaketes.Ice.ObjectAdapter adapter = communicator().createObjectAdapter("Server");
    adapter.add(new generadorDePaketes.Servicios(), Ice.Util.stringToIdentity("server"));
    adapter.activate();
    java.lang.System.out.println("Zerbitzaria martxan");
    communicator().waitForShutdown();
    return 0;
}