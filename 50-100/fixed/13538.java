@java.lang.Override
public void updateItems(org.wisdom.api.http.Request request, java.lang.String repositoryName, java.lang.String workspaceName, java.lang.String requestContent) throws javax.jcr.RepositoryException {
    com.fasterxml.jackson.databind.node.ObjectNode requestBody = stringToJSONObject(requestContent);
    if ((requestBody.size()) != 0) {
        javax.jcr.Session session = getSession(request, repositoryName, workspaceName);
        java.util.TreeMap<java.lang.String, com.fasterxml.jackson.databind.JsonNode> nodesByPath = createNodesByPathMap(requestBody);
        updateMultipleNodes(request, session, nodesByPath);
    }
}