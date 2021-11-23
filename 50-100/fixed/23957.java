@java.lang.Override
public void close() throws java.io.IOException {
    if ((currentResponse) != null) {
        try {
            currentResponse.close();
        } catch (java.io.IOException e) {
            com.sedmelluq.discord.lavaplayer.tools.io.PersistentHttpStream.log.debug("Failed to close response.", e);
        }
        currentResponse = null;
        currentContent = null;
    }
}