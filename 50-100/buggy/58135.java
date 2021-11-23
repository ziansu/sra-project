public static java.lang.String extractNameFromMetadata(org.lareferencia.backend.harvester.OAIRecordMetadata metadata, java.lang.String fieldname, java.lang.String prefix) {
    java.lang.String name = org.lareferencia.backend.util.RepositoryNameHelper.UNKNOWN;
    for (org.w3c.dom.Node node : metadata.getFieldNodes(fieldname)) {
        java.lang.String occr = node.getFirstChild().getNodeValue();
        if (occr.startsWith(prefix))
            name = occr.substring(prefix.length()).trim();
        
    }
    return name;
}