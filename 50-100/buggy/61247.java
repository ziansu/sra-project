@java.lang.Override
public final java.util.Set<java.security.cert.X509CRL> fetch(@javax.validation.constraints.NotNull
final java.lang.Object[] crls) throws java.lang.Exception {
    if ((crls.length) == 0) {
        throw new java.lang.IllegalArgumentException("Must provide at least one non-null CRL resource.");
    }
    final java.util.Set<java.security.cert.X509CRL> results = new java.util.HashSet<>();
    for (final java.lang.Object r : crls) {
        logger.debug("Fetching CRL data from {}", r);
        final java.security.cert.X509CRL crl = fetchInternal(r);
        if (crl != null) {
            results.add(crl);
        }
    }
    return results;
}