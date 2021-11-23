@java.lang.Override
public java.util.Set<io.cattle.platform.api.auth.Identity> getIdentities(io.cattle.platform.core.model.Account account) {
    java.util.Set<io.cattle.platform.api.auth.Identity> identities = new java.util.HashSet<>();
    identities.add(new io.cattle.platform.api.auth.Identity(io.cattle.platform.core.constants.ProjectConstants.RANCHER_ID, java.lang.String.valueOf(account.getId()), account.getName()));
    return identities;
}