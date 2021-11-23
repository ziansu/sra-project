public java.util.List<java.lang.Object> getAllGames() {
    org.ektorp.ViewQuery query = new org.ektorp.ViewQuery().allDocs().includeDocs(true);
    java.util.List<java.lang.Object> gameList = new java.util.ArrayList<java.lang.Object>();
    for (htwg.se.persistence.CouchDB.PersistentGameOverview persGamefield : db.queryView(query, htwg.se.persistence.CouchDB.PersistentGameOverview.class)) {
        gameList.add(persGamefield);
    }
    return gameList;
}