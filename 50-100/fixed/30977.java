public void init(int indexNameId, long entityId, java.lang.String keyId, int startTime, int endTime, java.lang.Object value, long startNode, long endNode) {
    super.init(NeoCommandType.DYN_INDEX_ADD_RELATIONSHIP_COMMAND, indexNameId, IndexEntityType.Relationship.id(), entityId, keyId, startTime, endTime, value);
    this.startNode = startNode;
    this.endNode = endNode;
}