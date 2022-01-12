protected void closePipelines() {
    for (be.nabu.libs.nio.api.Pipeline pipeline : channels.values()) {
        try {
            pipeline.close();
        } catch (java.lang.Exception e) {
            logger.error("Could not close pipeline", e);
        }
    }
    synchronized(channels) {
        channels.clear();
    }
}