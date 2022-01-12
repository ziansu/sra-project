public com.sylweb.myplex.VideoEntry saveEntry(com.sylweb.myplex.VideoEntry vid) {
    java.lang.String query = "SELECT * FROM video WHERE id = %d AND library_id = %d";
    query = java.lang.String.format(query, vid.id, vid.library_id);
    com.sylweb.myplex.DBManager db = new com.sylweb.myplex.DBManager();
    java.util.ArrayList results = db.executeQuery(query);
    if ((results == null) || ((results.size()) < 1)) {
        return insertEntry(vid);
    }else
        return updateEntry(vid);
    
}