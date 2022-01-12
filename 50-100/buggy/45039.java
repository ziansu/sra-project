public void syncBoardGameCollection(android.content.Context ctx) {
    java.util.ArrayList<com.ggalasso.BggCollectionManager.model.BoardGame> apiGames = getBoardGames();
    com.ggalasso.BggCollectionManager.db.BoardGameTable bgt = new com.ggalasso.BggCollectionManager.db.BoardGameTable(ctx);
    java.lang.Integer rowCount = bgt.fetchBoardGameCount();
    if (rowCount > 0) {
        java.util.ArrayList<com.ggalasso.BggCollectionManager.model.BoardGame> dbGames = bgt.fetchAllBoardGames();
        java.util.Map<java.lang.String, com.ggalasso.BggCollectionManager.model.BoardGame> bgMap = markAPIvsDB(apiGames, dbGames);
        syncShallowIteratorComparison(bgMap);
    }else {
        syncDeep(apiGames, bgt);
    }
}