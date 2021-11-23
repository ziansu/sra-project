@java.lang.Override
public void run() {
    try {
        final java.util.Set<org.springframework.core.io.Resource> resources = this.getResources();
        final java.util.Set<java.security.cert.X509CRL> results = getFetcher().fetch(resources);
        this.addCrls(results);
    } catch (final java.lang.Exception e) {
        logger.debug(e.getMessage(), e);
    }
}