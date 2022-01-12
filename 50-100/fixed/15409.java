@java.lang.Override
public void stop() {
    if ((channel) != null) {
        try {
            channel.close();
            for (be.nabu.libs.nio.api.Pipeline pipeline : channels.values()) {
                pipeline.close();
            }
            synchronized(channels) {
                channels.clear();
            }
            channel = null;
        } catch (java.io.IOException e) {
            logger.error("Failed to close server", e);
        }
    }
}