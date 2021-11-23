@com.google.common.annotations.VisibleForTesting
static java.lang.String getUniqueId(java.util.Set<java.lang.String> ids) {
    java.lang.String id;
    do {
        id = (java.lang.Long.toHexString(java.lang.System.currentTimeMillis())) + (java.lang.Long.toHexString(java.lang.Math.abs(com.google.gcloud.dns.testing.LocalDnsHelper.ID_GENERATOR.nextLong())));
    } while (ids.contains(id) );
    return id;
}