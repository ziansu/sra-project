public int run(final java.lang.String[] args) {
    if ((args.length) > 0) {
        return 1;
    }
    generadorDePaketes.Ice.ObjectAdapter adapter = communicator().createObjectAdapter("Server");
    adapter.add(new generadorDePaketes.Servicios(), Ice.Util.stringToIdentity("server"));
    adapter.activate();
    communicator().waitForShutdown();
    return 0;
}