public void shutdown(Ice.Current c) {
    java.lang.System.out.println("Shutting down Sensor ...");
    shutdown = true;
    c.adapter.getCommunicator().destroy();
}