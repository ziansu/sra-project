private static boolean hasTargetClass(org.eclipse.rdf4j.model.Resource shapeId, org.eclipse.rdf4j.repository.sail.SailRepositoryConnection connection) {
    return connection.hasStatement(shapeId, SHACL.TARGET_CLASS, null, true);
}