public com.arangodb.entity.EdgeDefinitionEntity getEdgeDefinition(java.lang.String collectionName) {
    for (com.arangodb.entity.EdgeDefinitionEntity edgeDefintion : this.edgeDefinitions) {
        if (edgeDefintion.getCollection().equals(collectionName)) {
            return edgeDefintion;
        }
    }
    return null;
}