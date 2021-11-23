@java.lang.Override
public void onAllDataRead() {
    com.dexels.navajo.listeners.stream.ServletReadListener.logger.debug("Read all the data from ServletInputStream");
    com.dexels.navajo.listeners.stream.ServletReadListener.logger.debug("Doing one last read:");
    try {
        onDataAvailable();
    } catch (java.io.IOException e) {
        com.dexels.navajo.listeners.stream.ServletReadListener.logger.error("Error: ", e);
    }
    if (!(subscriber.isUnsubscribed())) {
        subscriber.onCompleted();
    }
}