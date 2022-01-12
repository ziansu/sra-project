private void setData(com.fasterxml.jackson.databind.node.ArrayNode data, boolean newQuery) {
    assert data != null;
    com.chiralbehaviors.graphql.layout.schema.Relation schema = ((com.chiralbehaviors.graphql.layout.schema.Relation) (com.chiralbehaviors.graphql.layout.schema.Relation.buildSchema(queryState.getQuery(), queryState.getSource())));
    schemaView.setRoot(schema);
    layout.setRoot(schema);
    layout.measure(data);
    layout.setData(data);
    layout.autoLayout();
}