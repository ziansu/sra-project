public org.apache.hadoop.security.UserGroupInformation getUGI(co.cask.cdap.proto.NamespaceMeta namespaceMeta) throws java.io.IOException {
    if ((!(kerberosEnabled)) || (NamespaceId.SYSTEM.equals(namespaceMeta.getNamespaceId()))) {
        return org.apache.hadoop.security.UserGroupInformation.getCurrentUser();
    }
    return getUGI(impersonationUserResolver.getImpersonationInfo(namespaceMeta));
}