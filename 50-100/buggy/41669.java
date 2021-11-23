@java.lang.Override
public void addListOfRelatedToEdges(java.util.regex.Matcher matcher, org.apache.tinkerpop.gremlin.structure.Vertex message) {
    java.lang.String messageUsername = message.property("username").value().toString();
    if (messageUsername.equals("ThoughtWorks")) {
        super.addListOfRelatedToEdges(matcher, message);
    }else {
        java.util.Optional<org.apache.tinkerpop.gremlin.structure.Vertex> vertexByName = findVertexByName(messageUsername);
        org.apache.tinkerpop.gremlin.structure.Vertex adjacentNode = (vertexByName.isPresent()) ? vertexByName.get() : createSkillNode(messageUsername);
        adjacentNode.addEdge("related_to", message);
    }
}