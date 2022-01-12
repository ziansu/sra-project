private boolean isMyIDP(org.apache.jackrabbit.oak.spi.security.authentication.external.SyncedIdentity id) {
    java.lang.String idpName = ((id.getExternalIdRef()) == null) ? null : id.getExternalIdRef().getProviderName();
    return ((idpName == null) || ((idpName.length()) == 0)) || (idpName.equals(idp.getName()));
}