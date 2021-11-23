public java.util.List getAllGames() {
    org.ektorp.ViewQuery query = new org.ektorp.ViewQuery().allDocs().includeDocs(true);
    java.util.List<htwg.se.persistence.CouchDB.PersistentGameOverview> gameList = new java.util.ArrayList<htwg.se.persistence.CouchDB.PersistentGameOverview>();
    for (htwg.se.persistence.CouchDB.PersistentGameOverview persGamefield : db.queryView(query, htwg.se.persistence.CouchDB.PersistentGameOverview.class)) {
        gameList.add(persGamefield);
    }
    return gameList;
}