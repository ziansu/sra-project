protected void closePipelines() {
    synchronized(channels) {
        for (be.nabu.libs.nio.api.Pipeline pipeline : channels.values()) {
            try {
                pipeline.close();
            } catch (java.lang.Exception e) {
                logger.error("Could not close pipeline", e);
            }
        }
        channels.clear();
    }
}