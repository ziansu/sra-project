public void run() {
    if (((java.lang.System.currentTimeMillis()) - (startTime)) > (checkTime)) {
        client.setStatus(false);
        log.info("Moniter reconnect....... ");
        client.reConnect();
    }
    client.sentPing();
}