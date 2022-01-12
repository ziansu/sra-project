@java.lang.Override
public void revokeRole(java.util.List<org.apache.hadoop.hive.ql.security.authorization.plugin.HivePrincipal> hivePrincipals, java.util.List<java.lang.String> roles, boolean grantOption, org.apache.hadoop.hive.ql.security.authorization.plugin.HivePrincipal grantorPrinc) throws org.apache.hadoop.hive.ql.security.authorization.plugin.HiveAccessControlException, org.apache.hadoop.hive.ql.security.authorization.plugin.HiveAuthzPluginException {
    grantOrRevokeRoleOnGroup(hivePrincipals, roles, grantorPrinc, false);
}