private static java.lang.String get_ccs(org.neo4j.graphdb.GraphDatabaseService db, java.lang.String code, java.lang.String domain) {
    org.neo4j.graphdb.Label label = org.eihg.phevor.plugins.AddParents.domain_label.get(domain);
    code = code.trim().replace(".", "");
    return org.eihg.phevor.plugins.AddParents.find_ccs(db, code, label);
}