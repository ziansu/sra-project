@java.lang.Override
public void run() {
    try {
        codeu.chat.server.Server.LOG.info("Reading update from relay...");
        for (final codeu.chat.common.Relay.Bundle bundle : relay.read(id, secret, lastSeen, 32)) {
            onBundle(bundle);
            lastSeen = bundle.id();
        }
    } catch (java.lang.Exception ex) {
        codeu.chat.server.Server.LOG.error(ex, "Failed to read update from relay.");
    }
    timeline.scheduleIn(codeu.chat.server.Server.RELAY_REFRESH_MS, this);
}