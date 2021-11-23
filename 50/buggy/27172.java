public void cleanDb() {
    session.execute("MATCH n OPTIONAL MATCH n-[r]-m delete n,r,m");
}