@java.lang.Override
public java.util.Set<io.cattle.platform.api.auth.Identity> getIdentities(io.cattle.platform.core.model.Account account) {
    java.util.Set<io.cattle.platform.api.auth.Identity> identities = new java.util.HashSet<>();
    java.lang.String accountId = ((java.lang.String) (io.github.ibuildthecloud.gdapi.context.ApiContext.getContext().getIdFormatter().formatId(objectManager.getType(io.cattle.platform.core.model.Account.class), account.getId())));
    identities.add(new io.cattle.platform.api.auth.Identity(io.cattle.platform.core.constants.ProjectConstants.RANCHER_ID, java.lang.String.valueOf(accountId), account.getName()));
    return identities;
}