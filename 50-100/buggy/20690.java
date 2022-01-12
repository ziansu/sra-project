private static java.util.Map<hudson.security.Permission, java.lang.String> initRequirePremissions() {
    java.util.Map<hudson.security.Permission, java.lang.String> result = new org.apache.commons.collections.map.HashedMap();
    result.put(Item.CREATE, "Job.CREATE");
    result.put(Item.DELETE, "Job.DELETE");
    result.put(Item.READ, "Job.READ");
    result.put(CredentialsProvider.CREATE, "Credentials.CREATE");
    result.put(CredentialsProvider.UPDATE, "Credentials.UPDATE");
    result.put(CredentialsProvider.DELETE, "Credentials.DELETE");
    result.put(CredentialsProvider.VIEW, "Credentials.VIEW");
    return result;
}