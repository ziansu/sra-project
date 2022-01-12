private java.lang.Object createRandomObject(final com.github.kuros.random.jpa.types.Node node) {
    final java.lang.Class<?> type = node.getType();
    final java.lang.Object random = randomize.createRandom(type);
    final com.github.kuros.random.jpa.definition.TableNode tableNode = creationOrder.getTableNode(type);
    final java.util.List<com.github.kuros.random.jpa.mapper.Relation> relations = tableNode.getRelations();
    for (com.github.kuros.random.jpa.mapper.Relation relation : relations) {
        createRelation(relation, random);
    }
    return random;
}