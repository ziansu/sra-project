public void cleanDb(org.neo4j.ogm.session.Session session) {
    session.execute("MATCH n OPTIONAL MATCH n-[r]-m delete n,r,m");
}