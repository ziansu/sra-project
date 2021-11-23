public static java.lang.String getString(java.lang.String key, long langId) {
    return org.apache.openmeetings.db.util.ApplicationHelper._ensureApplication(langId).getOmString(key, langId);
}