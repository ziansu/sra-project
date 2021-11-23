@java.lang.Override
public java.util.List<be.insaneprogramming.cleanarch.entity.Building> findByNameStartingWith(java.lang.String name) {
    final org.mongodb.morphia.query.Query<be.insaneprogramming.cleanarch.entitygatewayimpl.morphia.BuildingDocument> query = datastore.createQuery(be.insaneprogramming.cleanarch.entitygatewayimpl.morphia.BuildingDocument.class);
    query.criteria("name").startsWith(name);
    return query.asList().stream().map(this::toDomain).collect(java.util.stream.Collectors.toList());
}