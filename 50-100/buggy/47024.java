public static org.eclipse.jgit.transport.Transport open(final org.eclipse.jgit.lib.Repository local, final java.lang.String remote, final org.eclipse.jgit.transport.Transport.Operation op) throws java.net.URISyntaxException, org.eclipse.jgit.errors.NotSupportedException, org.eclipse.jgit.errors.TransportException {
    final org.eclipse.jgit.transport.RemoteConfig cfg = new org.eclipse.jgit.transport.RemoteConfig(local.getConfig(), remote);
    if (org.eclipse.jgit.transport.Transport.doesNotExist(cfg))
        return org.eclipse.jgit.transport.Transport.open(local, new org.eclipse.jgit.transport.URIish(remote), null);
    
    return org.eclipse.jgit.transport.Transport.open(local, cfg, op);
}