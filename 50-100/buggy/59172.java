public static java.lang.String resolveUrlOrExpression(final org.apache.maven.project.MavenProject project, final org.apache.maven.plugin.logging.Log log) {
    java.lang.String connectionUrl = null;
    if ((project.getScm()) != null) {
        connectionUrl = project.getScm().getDeveloperConnection();
        if (org.apache.commons.lang.StringUtils.isBlank(connectionUrl)) {
            connectionUrl = project.getScm().getConnection();
        }
        return connectionUrl;
    }
    return com.e_gineering.maven.gitflowhelper.ScmUtils.DEFAULT_URL_EXPRESSION;
}