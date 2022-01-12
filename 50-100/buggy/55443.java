public void addListener(final java.lang.String providerId, final org.eclipse.packagedrone.repo.channel.impl.ProviderListener listener) {
    try (org.eclipse.packagedrone.utils.Locks.Locked l = org.eclipse.packagedrone.utils.Locks.lock(this.writeLock)) {
        final org.eclipse.packagedrone.repo.channel.provider.ChannelProvider provider = this.providers.get(providerId);
        if (provider != null) {
            this.listeners.put(providerId, listener);
            listener.bind(provider);
        }
    }
}