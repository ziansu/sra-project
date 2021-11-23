private boolean isAdmin() {
    io.cattle.platform.api.auth.Policy policy = ((io.cattle.platform.api.auth.Policy) (io.github.ibuildthecloud.gdapi.context.ApiContext.getContext().getPolicy()));
    if (policy == null) {
        return false;
    }
    java.lang.String kind = getAccountById(policy.getAccountId()).getKind();
    return (kind.equalsIgnoreCase("admin")) || (kind.equalsIgnoreCase("superadmin"));
}