public void delete(com.redhat.engineering.plugins.domain.Session session) {
    java.lang.String storeKey = getIssueStoreKey(session.getIssue());
    pluginSettings.remove(storeKey);
    java.util.List<java.lang.String> allSessions = ((java.util.List<java.lang.String>) (pluginSettings.get(((getKey()) + ".all"))));
    if (allSessions != null) {
        allSessions.remove(session.getIssue().getKey());
        pluginSettings.put(((getKey()) + ".all"), allSessions);
    }
}