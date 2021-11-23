public void start(java.nio.channels.ByteChannel channel) {
    isRunning = true;
    stream = new com.comino.mav.mavlink.MAVLinkStream(channel);
    java.lang.Thread s = new java.lang.Thread(new com.comino.mav.mavlink.MAVLinkToModelParser.MAVLinkParserWorker());
    s.start();
}