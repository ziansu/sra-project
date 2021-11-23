public void addProjectVersion(int projectId, int version, java.io.File localFile, java.lang.String uploader, java.lang.String uri) throws azkaban.project.ProjectManagerException {
    try (java.sql.Connection connection = getConnection()) {
        addProjectToProjectVersions(connection, projectId, version, localFile, uploader, uri);
        connection.commit();
    } catch (java.sql.SQLException e) {
        azkaban.project.JdbcProjectLoader.logger.error(e);
        throw new azkaban.project.ProjectManagerException(java.lang.String.format("Add ProjectVersion failed. project id: %d version: %d", projectId, version), e);
    }
}