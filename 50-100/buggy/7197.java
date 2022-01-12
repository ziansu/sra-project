public int countEventsAtLocation(java.lang.String id) {
    int counter = -1;
    java.lang.String request = handlers.HttpHandler.eventCounter(id);
    try {
        counter = java.lang.Integer.parseInt(new handlers.HttpTask().execute("GET", request).get());
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return counter;
}