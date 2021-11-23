private void csGrant() throws java.io.IOException {
    java.lang.System.out.println(("Granting request. Timestamp: " + (token_ts)));
    for (java.util.logging.Handler h : aosme.Kernel.critical_section_logger.getHandlers()) {
        h.flush();
    }
    token_in_use = true;
    aosme.Kernel.toApp.write(MessageType.CSGRANT.toCode());
    aosme.Kernel.toApp.flush();
}