private boolean isMyIDP(@javax.annotation.Nonnull
org.apache.jackrabbit.oak.spi.security.authentication.external.SyncedIdentity id) {
    java.lang.String idpName = ((id.getExternalIdRef()) == null) ? null : id.getExternalIdRef().getProviderName();
    return ((idpName == null) || (idpName.isEmpty())) || (idpName.equals(idp.getName()));
}