@java.lang.Override
public final boolean equals(final java.lang.Object object) {
    if (object instanceof au.com.agic.deploymentsync.core.deployment.Deployment) {
        final au.com.agic.deploymentsync.core.deployment.Deployment deployment = ((au.com.agic.deploymentsync.core.deployment.Deployment) (object));
        return org.apache.commons.codec.binary.Hex.encodeHexString(getSha1()).equals(org.apache.commons.codec.binary.Hex.encodeHexString(deployment.getSha1()));
    }
    return false;
}