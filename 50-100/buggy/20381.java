@java.lang.Override
public final synchronized void stop() {
    com.google.common.base.Preconditions.checkState(((this.registrations) != null));
    for (final java.lang.AutoCloseable r : this.registrations) {
        try {
            r.close();
        } catch (final java.lang.Exception e) {
            org.opendaylight.protocol.bgp.parser.spi.AbstractBGPExtensionProviderActivator.LOG.warn("Failed to close registration", e);
        }
    }
    this.registrations = null;
}