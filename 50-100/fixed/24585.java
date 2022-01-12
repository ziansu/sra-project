private java.util.Map<java.lang.String, java.lang.Object> getParameters(org.neo4j.shell.Session session) throws org.neo4j.shell.ShellException {
    try {
        org.neo4j.shell.kernel.apps.NodeOrRelationship self = getCurrent(session);
        session.set("self", (self.isNode() ? self.asNode() : self.asRelationship()));
    } catch (org.neo4j.shell.ShellException e) {
    }
    return session.asMap();
}