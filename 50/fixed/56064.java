@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public com.google.gerrit.extensions.restapi.RestModifyView<com.google.gerrit.server.project.ProjectResource, ?> create(com.google.gerrit.server.project.ProjectResource parent, com.google.gerrit.extensions.restapi.IdString id) throws com.google.gerrit.extensions.restapi.RestApiException {
    if (id.toString().equals("default")) {
        return createDefault.get();
    }
    throw new com.google.gerrit.extensions.restapi.ResourceNotFoundException(id);
}