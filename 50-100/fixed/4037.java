public static int findAvailablePort(int maxRetries) {
    int retries = 0;
    int randomPort;
    boolean portAvailable;
    do {
        randomPort = io.inkstand.scribble.net.NetworkUtils.randomPort();
        portAvailable = io.inkstand.scribble.net.NetworkUtils.isPortAvailable(randomPort);
        retries++;
    } while ((retries <= maxRetries) && (!portAvailable) );
    org.junit.Assume.assumeTrue("no open port found", portAvailable);
    return randomPort;
}