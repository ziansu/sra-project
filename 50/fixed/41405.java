@java.lang.Override
public org.rakam.util.ProjectCollection getUserTable(java.lang.String project, boolean isEventFilterActive) {
    return new org.rakam.util.ProjectCollection(project, org.rakam.postgresql.plugin.user.PostgresqlUserStorage.USER_TABLE);
}