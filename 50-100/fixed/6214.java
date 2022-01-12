@java.lang.Override
public java.util.List<org.apache.river.api.security.PermissionGrant> getPermissionGrants(java.security.ProtectionDomain domain) {
    java.util.List<org.apache.river.api.security.PermissionGrant> grants;
    if ((basePolicy) instanceof org.apache.river.api.security.ScalableNestedPolicy) {
        grants = ((org.apache.river.api.security.ScalableNestedPolicy) (basePolicy)).getPermissionGrants(domain);
    }else {
        grants = new java.util.LinkedList<org.apache.river.api.security.PermissionGrant>();
        grants.add(extractGrantFromPolicy(basePolicy, domain));
    }
    org.apache.river.api.security.PermissionGrant[] rpg = remotePolicyGrants;
    grants.addAll(java.util.Arrays.asList(rpg));
    return grants;
}