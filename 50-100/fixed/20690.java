private static java.util.Map<hudson.security.Permission, java.lang.String> initRequirePremissions() {
    java.util.Map<hudson.security.Permission, java.lang.String> result = new org.apache.commons.collections.map.HashedMap();
    result.put(Item.CREATE, "Job.CREATE");
    result.put(Item.DELETE, "Job.DELETE");
    result.put(Item.READ, "Job.READ");
    return result;
}