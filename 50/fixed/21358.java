public void stop() {
    application.close();
    initiator.stop();
    log.info("stop : OK");
}