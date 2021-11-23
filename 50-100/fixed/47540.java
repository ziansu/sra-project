private static void handleRun(ru.spbau.mit.Client client, byte[] trackerAddress) {
    try {
        client.start(trackerAddress);
        client.run(trackerAddress);
    } catch (java.nio.file.NoSuchFileException e) {
        ru.spbau.mit.TorrentClient.LOGGER.error("Wrong file path");
    } catch (java.io.IOException e) {
        ru.spbau.mit.TorrentClient.LOGGER.warn(("NewFile request exception: " + (e.getMessage())));
    }
}